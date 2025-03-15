package com.example.doctorappointmentapplication.navigation.routes

sealed class Screen(val route: String) {
    data object Intro: Screen("intro")
}