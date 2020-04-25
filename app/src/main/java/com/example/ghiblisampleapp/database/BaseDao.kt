package com.example.ghiblisampleapp.database

import io.reactivex.Completable
import io.reactivex.Flowable

interface BaseDao<T> {

    fun getItems(): Flowable<List<T>>
    fun getItem(itemId: String): Flowable<T>
    fun addItems(vararg items: T): Completable
    fun deleteItems(): Completable
}