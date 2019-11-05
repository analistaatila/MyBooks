package com.example.mybooks

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    val bookName: TextView
    val bookDesc: TextView

    init {
        bookName = v.findViewById(R.id.bookName)
        bookDesc = v.findViewById(R.id.bookDesc)
    }
}