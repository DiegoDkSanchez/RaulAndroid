package com.raulandroid.database

import androidx.room.Database
import com.raulandroid.database.entities.RoutineEntity

@Database(entities = [RoutineEntity::class], version = 1)
abstract class RaulDatabase {
}