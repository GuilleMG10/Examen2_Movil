package com.ucb.examen1.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ucb.examen1.home.HomeUI
import com.ucb.examen1.home.Home2UI
import com.ucb.examen1.home.Home3UI

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ) {
        composable(Screens.Home.route) {
            HomeUI(
                onGoToSend = {navController.navigate(Screens.Send.route)},
                onGoToLeft = {navController.navigate(Screens.Home3.route)},
                onGoToRight = {navController.navigate(Screens.Home2.route)}
            )
        }

        composable(Screens.Home2.route) {
            Home2UI (
                onGoToSend = {navController.navigate(Screens.Send.route)},
                onGoToLeft = {navController.navigate(Screens.Home.route)},
                onGoToRight = {navController.navigate(Screens.Home3.route)}
            )
        }

        composable(Screens.Home3.route) {
            Home3UI (
                onGoToSend = {navController.navigate(Screens.Send.route)},
                onGoToLeft = {navController.navigate(Screens.Home2.route)},
                onGoToRight = {navController.navigate(Screens.Home.route)}
            )
        }
}}