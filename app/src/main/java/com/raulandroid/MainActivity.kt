package com.raulandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.raulandroid.ui.features.HomeScreen
import com.raulandroid.ui.theme.RaulAndroidTheme

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
