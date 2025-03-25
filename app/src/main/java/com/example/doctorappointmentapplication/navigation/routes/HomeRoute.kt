package com.example.doctorappointmentapplication.navigation.routes

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.doctorappointmentapplication.core.viewmodel.MainViewModel
import com.example.doctorappointmentapplication.feature.home.MainScreen

fun NavGraphBuilder.homeRoute(
    mainViewModel: MainViewModel
) {
    composable(Screen.Home.route) {
        MainScreen(mainViewModel = mainViewModel)
    }
}