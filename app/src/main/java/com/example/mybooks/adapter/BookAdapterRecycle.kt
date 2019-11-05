package com.example.mybooks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mybooks.BookViewHolder
import com.example.mybooks.R
import com.example.mybooks.database.Book

class BookAdapterRecycle(val context: Context, val books: List<Book>): RecyclerView.Adapter<BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.books_item_list, parent, false);
        return BookViewHolder(v)
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.bookName.text = book.name
        holder.bookDesc.text = "Autor: ${books[position].author} - ${books[position].year}"
    }

}