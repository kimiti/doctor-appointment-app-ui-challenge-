package com.example.doctorappointmentapplication.core.repository

import com.example.doctorappointmentapplication.core.model.CategoryModel
import com.example.doctorappointmentapplication.core.model.DoctorModel

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

    val doctors = mutableListOf(
        DoctorModel(
            name = "Dr. John Doe",
            special = "Cardiology",
            rating = 4.5,
            picture = "dr_jessica_wyne"
        )
    )
}