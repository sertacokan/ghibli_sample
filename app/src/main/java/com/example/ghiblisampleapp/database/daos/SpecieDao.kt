package com.example.ghiblisampleapp.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ghiblisampleapp.database.BaseDao
import com.example.ghiblisampleapp.database.entities.SpecieEntity
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface SpecieDao : BaseDao<SpecieEntity> {

    @Query("SELECT * FROM SpecieTable")
    override fun getItems(): Flowable<List<SpecieEntity>>

    @Query("SELECT * FROM SpecieTable WHERE specieId = :itemId")
    override fun getItem(itemId: String): Flowable<SpecieEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override fun addItems(vararg items: SpecieEntity): Completable

    @Query("DELETE FROM SpecieTable")
    override fun deleteItems(): Completable
}