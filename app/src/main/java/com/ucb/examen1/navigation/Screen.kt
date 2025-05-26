package com.ucb.examen1.navigation

sealed class Screens(
    val route: String
) {
    object Home : Screens("home_screen")
    object Home2: Screens("home_b_screen")
    object Home3: Screens("home_3_screen")
    object Send: Screens("send_sim")
}