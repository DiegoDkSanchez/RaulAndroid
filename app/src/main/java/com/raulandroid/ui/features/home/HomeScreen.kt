package com.raulandroid.ui.features.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.raulandroid.ui.features.routines.RoutinesScreen
import com.raulandroid.ui.features.summary.SummaryScreen
import com.raulandroid.ui.nav.Screen

/// Navigation
val items = listOf(
    Screen.Routines,
    Screen.Summary,
)

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val route = navBackStackEntry?.destination?.hierarchy?.first()?.route
                println(route)
                items.forEach { screen ->
                    BottomNavigationItem(
                        icon = {
                            Icon(
                                Icons.Filled.Home,
                                contentDescription = null
                            )
                        },
                        label = {
                            Text(stringResource(screen.resourceId))
                        },
                        selected = route == screen.route,
                        onClick = {
                            navController.navigate(screen.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController,
            startDestination = Screen.Routines.route,
            Modifier.padding(innerPadding)
        ) {
            composable(Screen.Routines.route) { RoutinesScreen() }
            composable(Screen.Summary.route) { SummaryScreen() }
        }
    }
}

