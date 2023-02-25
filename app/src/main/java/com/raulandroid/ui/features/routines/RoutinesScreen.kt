package com.raulandroid.ui.features.routines

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Preview(showBackground = true)
@Composable
fun RoutinesScreen() {
    val viewModel = hiltViewModel<RoutinesViewModel>()
    val routines by viewModel.routines().observeAsState(listOf())
    Column(
        modifier = Modifier.fillMaxSize(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
    ) {
        TextButton(
            onClick = {
                viewModel.addRoutine()
            },
        ) {
            Text(text = "ROUTINES")
        }
        LazyColumn {
            items(items = routines) { routine ->
                Box (Modifier.padding(10.dp)) {
                    Text(text = routine.date.toString())
                }
            }
        }
    }
}