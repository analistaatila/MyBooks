package com.example.mybooks.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book(
    var name:String,
    var author:String,
    var year:Int,
    var rating:Float
) {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}