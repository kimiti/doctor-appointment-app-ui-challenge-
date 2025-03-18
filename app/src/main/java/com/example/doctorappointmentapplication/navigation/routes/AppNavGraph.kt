package com.example.doctorappointmentapplication.navigation.routes

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun AppNavGraph(
    nav: NavHostController
) {
    NavHost(navController = nav, startDestination = Screen.Intro.route) {
        IntroRoutes(onStart = {
            nav.navigate(Screen.Home.route) {
                popUpTo(Screen.Intro.route) { inclusive = true }
            }
        })
    }

}