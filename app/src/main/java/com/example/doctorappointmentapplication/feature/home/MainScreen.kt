package com.example.doctorappointmentapplication.feature.home

import androidx.activity.viewModels
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.doctorappointmentapplication.core.model.CategoryModel
import com.example.doctorappointmentapplication.core.viewmodel.MainViewModel
import kotlin.getValue

@Composable
fun MainScreen(items: List<CategoryModel>) {
    var selectedBottom by remember { mutableStateOf(0) }

    Scaffold(
        containerColor = Color.White,
        bottomBar = {
            HomeBottomBar(
                selected = selectedBottom,
                onSelect = { selectedBottom = it }
            )
        }
    ) { inner ->
        LazyColumn(contentPadding = inner) {
            item { HomeHeader() }
            item { Banner() }
            item {SectionHeader(title = "Doctor Speciality", onSeeAll = null)}
            item { CategoryRow(items = items) }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    val items = listOf<CategoryModel>(
        CategoryModel(
            0,
            "Cardiology",
            "cardiology"
        ),
        CategoryModel(
            1,
            "Dentistry",
            "dentistry"
        )
    )
    MainScreen(items = items)
}