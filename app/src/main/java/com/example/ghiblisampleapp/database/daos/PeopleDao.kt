package com.example.ghiblisampleapp.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ghiblisampleapp.database.BaseDao
import com.example.ghiblisampleapp.database.entities.PeopleEntity
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface PeopleDao : BaseDao<PeopleEntity>{

    @Query("SELECT * FROM PeopleTable")
    override fun getItems(): Flowable<List<PeopleEntity>>

    @Query("SELECT * FROM PeopleTable WHERE peopleId = :itemId")
    override fun getItem(itemId: String): Flowable<PeopleEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override fun addItems(vararg items: PeopleEntity): Completable

    @Query("DELETE FROM PeopleTable")
    override fun deleteItems(): Completable
}