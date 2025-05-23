package com.ucb.examen1.navigation

sealed class Screens(
    val route: String
) {
    object Home : Screens("home_screen")
}