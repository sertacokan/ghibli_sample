package com.example.ghiblisampleapp.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ghiblisampleapp.database.BaseDao
import com.example.ghiblisampleapp.database.entities.FilmEntity
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface FilmDao : BaseDao<FilmEntity>{

    @Query("SELECT * FROM FilmTable")
    override fun getItems(): Flowable<List<FilmEntity>>

    @Query("SELECT * FROM FilmTable WHERE filmId = :itemId")
    override fun getItem(itemId: String): Flowable<FilmEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override fun addItems(vararg items: FilmEntity): Completable

    @Query("DELETE FROM FilmTable")
    override fun deleteItems(): Completable
}