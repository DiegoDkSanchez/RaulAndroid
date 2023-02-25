package com.raulandroid.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val VALUE_COLUMN = "value"
const val EXERCISE_TYPE_COLUMN = "exercise_type"
const val ROUTINE_UID_COLUMN = "routine_uid"

@Entity
data class ExerciseEntity(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = VALUE_COLUMN) val value: String,
    @ColumnInfo(name = EXERCISE_TYPE_COLUMN) val exerciseType: String,
    @ColumnInfo(name = ROUTINE_UID_COLUMN) val routineUid: Int
)
