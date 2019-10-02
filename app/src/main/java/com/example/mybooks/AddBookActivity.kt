package com.example.mybooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_add_book.*

class AddBookActivity : AppCompatActivity() {

    val db:AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java, "my-books")
            .allowMainThreadQueries()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_book)

        btnSave.setOnClickListener {
            db.bookDao().inserir(Book(name.text.toString(), txtAuthor.text.toString(), txtYear.text.toString().toInt(), ratingBar.rating))
        }
    }
}
