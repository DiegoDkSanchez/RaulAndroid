package com.raulandroid.ui.nav

import androidx.annotation.StringRes
import com.raulandroid.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Routines : Screen("Routines", R.string.routines)
    object Summary : Screen("Summary", R.string.summary)
}