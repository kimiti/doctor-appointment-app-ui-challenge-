package com.example.doctorappointmentapplication.core.viewmodel

import androidx.lifecycle.ViewModel
import com.example.doctorappointmentapplication.core.repository.MainRepository

class MainViewModel(
    val repository: MainRepository = MainRepository()
) : ViewModel() {
    fun loadCategories() = repository.categoryItems
}