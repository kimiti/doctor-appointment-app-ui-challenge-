package com.example.doctorappointmentapplication.core.repository

import com.example.doctorappointmentapplication.core.model.CategoryModel

class MainRepository {
    val categoryItems = mutableListOf(
        CategoryModel(
            0,
            "Cardiology",
            "https://firebasestorage.googleapis.com/v0/b/project198-ee047.appspot.com/o/Cardiology.png?alt=media&token=0aa6ee72-1f35-4b20-a00f-2cd72d3e8929"
        ),
        CategoryModel(
            1,
            "Dentistry",
            "https://firebasestorage.googleapis.com/v0/b/project198-ee047.appspot.com/o/Dentistry.png?alt=media&token=a0206a44-233c-4f94-a0d1-6fa7a7efa679"
        ),
    )
}