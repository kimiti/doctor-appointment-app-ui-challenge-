package com.example.doctorappointmentapplication.core.repository

import com.example.doctorappointmentapplication.core.model.CategoryModel

class MainRepository {
    val categoryItems = mutableListOf(
        CategoryModel(
            0,
            "Cardiology",
            "cardiology"
        ),
        CategoryModel(
            1,
            "Dentistry",
            "dentistry"
        ),
    )
}