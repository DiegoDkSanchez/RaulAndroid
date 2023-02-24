package com.raulandroid.models

const val CARDIO = "Cardio"
const val SETS = "Sets"

sealed class ExerciseType(name: String) {
    object Cardio: ExerciseType(CARDIO)
    object Sets: ExerciseType(SETS)
}
