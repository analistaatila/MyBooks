package com.example.mybooks.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mybooks.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            startActivity(Intent(this, AddBookActivity::class.java))
        }

        btnListAd.setOnClickListener {
            startActivity(Intent(this, ListBooksActivity::class.java))
        }

        btnListad.setOnClickListener {
            startActivity(Intent(this, ListAdapterActivity::class.java))
        }

        btnListre.setOnClickListener {
            startActivity(Intent(this, ListBookRecycleActivity::class.java))
        }

        btnListp.setOnClickListener {
            startActivity(Intent(this, PageViewActivity::class.java))
        }
    }
}
