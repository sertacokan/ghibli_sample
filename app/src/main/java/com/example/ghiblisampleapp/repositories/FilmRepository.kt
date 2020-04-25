package com.example.ghiblisampleapp.repositories

import com.example.ghiblisampleapp.database.daos.FilmDao
import com.example.ghiblisampleapp.network.FilmService

class FilmRepository(private val filmDao: FilmDao, private val filmService: FilmService) {



}