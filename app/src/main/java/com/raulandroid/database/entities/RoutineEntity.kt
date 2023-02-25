package com.raulandroid.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RoutineEntity(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "date") val date: String,
)
