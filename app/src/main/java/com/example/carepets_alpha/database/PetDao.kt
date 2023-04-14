package com.example.carepets_alpha.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PetDao {

    @Insert
    fun insertPet(pet: Pet?)



    @Update
    fun updatePet(pet: Pet?)

    @Query("SELECT * FROM pet_table")
    fun getAll(): List<Pet>

    @Query("SELECT * from pet_table WHERE id = :id")
    fun getPet(id: Int): Pet?

    @Query("DELETE FROM Pet_table")
    fun delAll()

    @Query("DELETE FROM pet_table WHERE id = :id")
    fun delPet(id: Int)
}