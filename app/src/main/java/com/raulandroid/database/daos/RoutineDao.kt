package com.raulandroid.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.raulandroid.database.entities.RoutineEntity

const val ROUTINE_TABLE = "routine"

@Dao
interface RoutineDao {
    @Query("SELECT * FROM $ROUTINE_TABLE")
    fun getAll(): List<RoutineEntity>

    @Insert
    fun insertRoutine(vararg routineEntity: RoutineEntity)

    @Delete
    fun delete(routineEntity: RoutineEntity)
}