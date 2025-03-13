package com.example.doctorappointmentapplication.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

import com.example.doctorappointmentapplication.R
import com.example.doctorappointmentapplication.core.model.CategoryModel

@Composable
fun CategoryItem(item: CategoryModel){
    Column(modifier = Modifier
        .wrapContentSize()
        .padding(horizontal = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(modifier = Modifier
            .size(70.dp)
            .clip(CircleShape)
            .background(colorResource(R.color.lightPurple)),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = item.picture,
                contentDescription = null,
                modifier = Modifier.size(30.dp),
                contentScale = ContentScale.Fit
            )
        }
        Spacer(Modifier.height(8.dp))
        Text(
            text = item.name ?: "",
            color = colorResource(R.color.darkPurple)

        )
    }
}

@Composable
fun CategoryRow(){
    
}


@Preview
@Composable
fun CategoryItemPreview(){
    val item = CategoryModel(0, "Category 1", "picture_url")
    CategoryItem(item = item)
}