package com.example.mybooks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.example.mybooks.R
import com.example.mybooks.database.Book

class MyPageAdapter(var context: Context, var books:List<Book>): PagerAdapter() {
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.page_adapter_book, container, false)
        val txt: TextView = view.findViewById(R.id.bookName)
        txt.setText(books[position].name)
        container.addView(view)

        return view
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }

    override fun getCount(): Int {
        return books.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return books[position].name
    }
}