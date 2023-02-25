package com.raulandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.raulandroid.ui.features.home.HomeScreen
import com.raulandroid.ui.theme.RaulAndroidTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RaulAndroidTheme {
                HomeScreen()
            }
        }
    }
}
