package com.example.doctorappointmentapplication.feature.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.doctorappointmentapplication.core.model.CategoryModel

@Composable
fun CategoryItem(item: CategoryModel){

}


@Preview
@Composable
fun CategoryItemPreview(){
    val item = CategoryModel(0, "Category 1", "picture_url")
    CategoryItem(item = item)
}