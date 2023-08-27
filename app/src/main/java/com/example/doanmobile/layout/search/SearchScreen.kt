package com.example.doanmobile.layout.search

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.doanmobile.ui.theme.DoAnMobileTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.doanmobile.data.FilmNewItems
import com.example.doanmobile.layout.FilmNewListItem

@Composable
fun SearchScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Search()
        Trend()
        SearchTop()
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search() {
    Row() {
        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            trailingIcon = { Icon (Icons.Default.Search, contentDescription = "Search...") },
            colors = TextFieldDefaults . textFieldColors (
                cursorColor = Color.Black,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
            ),
            shape = RoundedCornerShape(20.dp)
        )
    }

}



@Composable
fun Trend() {
    Text(text = "Xu hướng gần đây",
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Start,
        fontSize = 25.sp,
        modifier = Modifier
            .padding(top = 10.dp, start = 20.dp))
    var news = remember { FilmNewItems.filmNewList}
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = news,
            itemContent = {
                FilmNewListItem(filmNew = it)
            }
        )
    }
}

@Composable
fun SearchTop() {
    Column() {
        Text(text = "Tìm kiếm hàng đầu",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            fontSize = 25.sp,
            modifier = Modifier
                .padding(top = 10.dp, start = 20.dp))
        Row() {
            Text(text = "Anime", modifier = Modifier.padding(start = 20.dp, top = 10.dp))
        }
    }

}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DoAnMobileTheme() {
        SearchScreen()
    }
}
