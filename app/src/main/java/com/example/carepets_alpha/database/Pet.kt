package com.example.carepets_alpha.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "pet_table")
data class Pet(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo(name = "pet_name")
    var name: String = "",

    @ColumnInfo(name = "pet_img")
    var img: Int = 0,

    @ColumnInfo(name = "pet_specifies")
    var species: String = "") {

    override fun toString(): String {
        return "Just input: id: $id - name: $name "
    }
}