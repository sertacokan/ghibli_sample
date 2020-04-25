package com.example.ghiblisampleapp.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ghiblisampleapp.database.BaseDao
import com.example.ghiblisampleapp.database.entities.VehicleEntity
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface VehicleDao : BaseDao<VehicleEntity> {

    @Query("SELECT * FROM VehicleTable")
    override fun getItems(): Flowable<List<VehicleEntity>>

    @Query("SELECT * FROM VehicleTable WHERE vehicleId = :itemId")
    override fun getItem(itemId: String): Flowable<VehicleEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override fun addItems(vararg items: VehicleEntity): Completable

    @Query("DELETE FROM VehicleTable")
    override fun deleteItems(): Completable
}