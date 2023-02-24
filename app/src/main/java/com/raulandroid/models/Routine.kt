package com.raulandroid.models

import java.util.Date

data class Routine(
    val date: Date,
    val exercises: List<Exercise>,
)