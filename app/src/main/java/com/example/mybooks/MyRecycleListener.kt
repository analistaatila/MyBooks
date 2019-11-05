package com.example.mybooks

import android.view.MotionEvent
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MyRecycleListener: RecyclerView.OnItemTouchListener {

    var listener: OnItemClickListener? = null

    interface  OnItemClickListener {
        fun onItemClick(view: View, position: Int)
        fun onItemLongClick(view: View, position: Int)
    }

    override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {
    }

    override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent) = false

    override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {
    }
}