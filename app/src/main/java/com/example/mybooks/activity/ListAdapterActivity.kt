package com.example.mybooks.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.example.mybooks.adapter.ListBookAdapter
import com.example.mybooks.R
import com.example.mybooks.database.AppDatabase
import com.example.mybooks.database.Book
import kotlinx.android.synthetic.main.activity_list_adapter.*

class ListAdapterActivity : AppCompatActivity() {

    val db: AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java, "my-books")
            .allowMainThreadQueries()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_adapter)

        var listAll = db.bookDao().listAll()

        gridview.adapter = ListBookAdapter(this, listAll as List<Book>)
        gridview.setOnItemClickListener{ adapterView, view, i, l ->
            var book = listAll?.get(i)
            Toast.makeText(this, "${book?.name} id=${book?.id}", Toast.LENGTH_SHORT).show()
        }
    }
}
