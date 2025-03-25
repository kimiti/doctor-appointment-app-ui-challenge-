package com.example.doctorappointmentapplication.navigation.routes

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.doctorappointmentapplication.core.viewmodel.MainViewModel

@Composable
fun AppNavGraph(
    nav: NavHostController,
    mainViewModel: MainViewModel,
    modifier: Modifier = Modifier
) {
    NavHost(navController = nav, startDestination = Screen.Intro.route,
        modifier = modifier) {
        IntroRoutes(onStart = {
            nav.navigate(Screen.Home.route) {
                popUpTo(Screen.Intro.route) { inclusive = true }
            }
        })

        homeRoute(mainViewModel = mainViewModel)
    }

}