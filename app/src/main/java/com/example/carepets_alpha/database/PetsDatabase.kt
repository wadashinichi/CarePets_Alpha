package com.example.carepets_alpha.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Pet::class], version = 1)
abstract class PetsDatabase : RoomDatabase() {
    abstract fun petDao(): PetDao

    companion object {

        @Volatile
        private var INSTANCE: PetsDatabase? = null

        fun getInstance(context: Context): PetsDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        PetsDatabase::class.java,
                        "pet_database"
                    )
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries()
                        .build()
//                        .also { INSTANCE = it }
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}