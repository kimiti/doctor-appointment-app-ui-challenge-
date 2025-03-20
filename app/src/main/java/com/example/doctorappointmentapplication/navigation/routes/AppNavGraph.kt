package com.example.doctorappointmentapplication.navigation.routes

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.doctorappointmentapplication.core.viewmodel.MainViewModel

@Composable
fun AppNavGraph(
    nav: NavHostController,
    mainViewModel: MainViewModel
) {
    NavHost(navController = nav, startDestination = Screen.Intro.route) {
        IntroRoutes(onStart = {
            nav.navigate(Screen.Home.route) {
                popUpTo(Screen.Intro.route) { inclusive = true }
            }
        })

        homeRoute(mainViewModel = mainViewModel)
    }

}