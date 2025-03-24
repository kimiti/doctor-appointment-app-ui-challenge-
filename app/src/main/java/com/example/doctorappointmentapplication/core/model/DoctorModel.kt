package com.example.doctorappointmentapplication.core.model

data class DoctorModel(
    val address: String = "",
    val biography: String = "",
    val id: String = "",
    val name: String = "",
    val special: String = "",
    val rating: Double = 0.0,
    val location: String = "",
    val mobile: String = "",
    val patients: String = "",
    val site: String = "",
    val picture: String = "",
    val experience: Int = 0
)
