package com.example.doanmobile.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.doanmobile.data.CategoryMovies

@Composable
fun CategoryListItem(categoryMovies: CategoryMovies) {
    Card(
        modifier = Modifier
            .padding(horizontal = 6.dp, vertical = 6.dp)
            .width(170.dp)
            .height(100.dp),
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Box() {
            categoryImage(categoryMovies = categoryMovies)
            Text(text = categoryMovies.title, fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxSize().size(18.dp).padding(top = 39.dp),
            color = Color.White)
        }
    }
}
@Composable
private fun categoryImage(categoryMovies: CategoryMovies) {
    Image(
        painter = painterResource(id = categoryMovies.imageCategoryId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}