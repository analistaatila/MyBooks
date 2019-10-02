package com.example.mybooks

import androidx.room.*

@Dao
interface BookDao   {
    @Insert
    fun inserir(book: Book): Long

    @Delete
    fun deletar(book: Book): Int

    @Update
    fun atualizar(book: Book): Int

    @Query("SELECT * FROM book")
    fun listAll(): Array<Book>

    @Query("SELECT * FROM book WHERE id = :id")
    fun findById(id: Long): Book

    @Query("SELECT * FROM book WHERE name = :name")
    fun findByName (name: String) : Book
}