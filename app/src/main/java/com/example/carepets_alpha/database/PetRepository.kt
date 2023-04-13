package com.example.carepets_alpha.database

import android.app.Application

class PetRepository(var application: Application) {
    private lateinit var db: PetsDatabase
    init {
        db = PetsDatabase.getInstance(application)
    }
    fun insert(pet: Pet?) {
        db.petDao().insertPet(pet)
    }
    fun getAll(): List<Pet> = db.petDao().getAll()
}