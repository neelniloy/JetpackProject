package com.niloythings.jetpackproject.ui

sealed class Routes(val route: String) {
    object Login : Routes("Login")
    object Home : Routes("Home")
}