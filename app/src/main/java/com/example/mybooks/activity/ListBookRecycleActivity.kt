package com.example.mybooks.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.mybooks.adapter.BookAdapterRecycle
import com.example.mybooks.R
import com.example.mybooks.database.AppDatabase
import kotlinx.android.synthetic.main.activity_list_book_recycle.*

class ListBookRecycleActivity : AppCompatActivity() {

    val db: AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java, "my-books")
            .allowMainThreadQueries()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_book_recycle)

        var listAll = db.bookDao().listAll()

        var adapter = BookAdapterRecycle(this, listAll)

        recyclerview.adapter = adapter

        val layout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerview.layoutManager = layout
    }
}
