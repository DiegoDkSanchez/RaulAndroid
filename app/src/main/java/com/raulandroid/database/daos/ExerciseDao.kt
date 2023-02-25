package com.raulandroid.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.raulandroid.database.entities.ExerciseEntity
import com.raulandroid.database.entities.ROUTINE_UID_COLUMN

const val EXERCISE_TABLE = "exercise"

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM $EXERCISE_TABLE")
    fun getAll(): List<ExerciseEntity>

    @Query("SELECT * FROM $EXERCISE_TABLE WHERE $ROUTINE_UID_COLUMN LIKE :uid")
    fun findExerciseByRoutine(uid: Int)

    @Insert
    fun insertExercise(vararg exerciseEntity: ExerciseEntity)
}