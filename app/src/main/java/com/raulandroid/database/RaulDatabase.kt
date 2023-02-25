package com.raulandroid.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.raulandroid.database.daos.ExerciseDao
import com.raulandroid.database.daos.RoutineDao
import com.raulandroid.database.entities.ExerciseEntity
import com.raulandroid.database.entities.RoutineEntity

@Database(entities = [RoutineEntity::class, ExerciseEntity::class], version = 1)
abstract class RaulDatabase : RoomDatabase() {
    abstract fun routineDao() : RoutineDao
    abstract fun exerciseDao() : ExerciseDao
}