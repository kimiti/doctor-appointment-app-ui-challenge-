package com.example.doctorappointmentapplication.navigation.routes

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.doctorappointmentapplication.feature.intro.IntroScreen

fun NavGraphBuilder.IntroRoutes(onStart: () -> Unit) {
    composable(Screen.Intro.route) {
        IntroScreen(onStartClick = onStart)
    }
}