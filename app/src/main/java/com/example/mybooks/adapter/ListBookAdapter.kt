package com.example.mybooks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.mybooks.R
import com.example.mybooks.database.Book

class ListBookAdapter(val context: Context, val books:List<Book>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val v = LayoutInflater.from(context).inflate(R.layout.books_item_list, parent, false);
        v.findViewById<TextView>(R.id.bookName).setText(books[position].name)
        v.findViewById<TextView>(R.id.bookDesc).setText("Autor: ${books[position].author} - ${books[position].year}")
        return v
    }

    override fun getItem(position: Int): Any {
        return books[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return books.size
    }

}