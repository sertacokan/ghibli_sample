package com.example.ghiblisampleapp.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ghiblisampleapp.database.BaseDao
import com.example.ghiblisampleapp.database.entities.LocationEntity
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface LocationDao : BaseDao<LocationEntity> {

    @Query("SELECT * FROM LocationTable")
    override fun getItems(): Flowable<List<LocationEntity>>

    @Query("SELECT * FROM LocationTable WHERE locationId = :itemId")
    override fun getItem(itemId: String): Flowable<LocationEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override fun addItems(vararg items: LocationEntity): Completable

    @Query("DELETE FROM LocationTable")
    override fun deleteItems(): Completable
}