package com.example.mybooks.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.mybooks.R
import com.example.mybooks.database.AppDatabase
import kotlinx.android.synthetic.main.activity_list_books.*

class ListBooksActivity : AppCompatActivity() {

    var currentIdx = 0

    val db: AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java, "my-books")
            .allowMainThreadQueries()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_books)

        var listAll = db.bookDao().listAll()

        fun updateTexts() {
            name.setText(listAll[currentIdx].name.toString())
        }

        listAll.forEach { Log.i("APPROOM", it.toString()) }

        if (listAll.size < 1) {
            btnBack.isEnabled = false
            btnNext.isEnabled = false
        } else {
            updateTexts()
        }

        btnNext.setOnClickListener {
            if (listAll.size > currentIdx && currentIdx <= listAll.size) {
                currentIdx++
                updateTexts()
            }
        }

        btnBack.setOnClickListener {
            if (currentIdx > 0) {
                currentIdx--
                updateTexts()
            }
        }


    }

}
