package com.example.doctorappointmentapplication.feature.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.doctorappointmentapplication.core.model.DoctorModel

@Composable
fun DoctorCard(item: DoctorModel, onClick: () -> Unit){
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(width = 190.dp, height = 260.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        onClick = onClick
    ){

    }
}

@Preview
@Composable
fun DoctorCardPreview(){
    val item = DoctorModel(name = "Dr. John Doe", special = "Cardiology", rating = 4.5)
    DoctorCard(item = item, onClick = {})
}