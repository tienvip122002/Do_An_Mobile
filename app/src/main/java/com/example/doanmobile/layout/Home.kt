package com.example.doanmobile.layout

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.doanmobile.R
import com.example.doanmobile.bottomnav.BottomNav
import com.example.doanmobile.data.CategoryItems
import com.example.doanmobile.data.FilmNewItems
import com.example.doanmobile.headtitle
import com.example.doanmobile.ui.theme.DoAnMobileTheme


@Composable
fun Home() {
    Box() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            header()
            Spacer(modifier = Modifier.height(5.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .size(500.dp, 500.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.Center
            ) {
                banner()
            }
            Spacer(modifier = Modifier.height(15.dp))
            category()
            Spacer(modifier = Modifier.height(15.dp))
            newfilm()
            Spacer(modifier = Modifier.height(15.dp))
            animeFilm()
        }
//        Row(
//            verticalAlignment = Alignment.Bottom
//        ) {
//            BottomNav()
//        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun header(){
    Row() {
        Icon(Icons.Default.PlayArrow, contentDescription = null, Modifier.size(40.dp), Color.Red)
        Box() {
            Text(text = "FPT Play",
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .width(70.dp)
                    .padding(top = 8.dp)
            )
        }
        Box(modifier = Modifier
            .align(Alignment.CenterVertically)
            .padding(start = 200.dp)) {
            Row() {
                Icon(
                    Icons.Default.Search, contentDescription = "Search...",
                    Modifier
                        .size(25.dp)
                        .width(100.dp),
                )
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    Icons.Default.Lock, contentDescription = "Search...",
                    Modifier
                        .size(25.dp)
                        .width(100.dp),
                )
            }
        }

    }
//        var ha by remember {
//            mutableStateOf("")
//        }
//        TextField(
//            value = ha,
//            onValueChange = { newValue ->
//                ha = newValue
//            },
//            modifier = Modifier
//                .height(40.dp)
//                .padding(10.dp),
//            trailingIcon = { Icon(Icons.Default.Search, contentDescription = "Search...") },
//            colors = TextFieldDefaults . textFieldColors (
//                cursorColor = Color.Black,
//                unfocusedIndicatorColor = Color.Transparent,
//                focusedIndicatorColor = Color.Transparent,
//                disabledIndicatorColor = Color.Transparent,
//            )
//        )
//
}


@Composable
fun banner() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.anime1),
            contentDescription = null,
            modifier = Modifier.height(500.dp),
            contentScale = ContentScale.Crop
        )
        Text(text = "Oshi Noko Naha",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 380.dp, start = 20.dp))

        Row(
            modifier = Modifier.padding(top = 415.dp, start = 20.dp)
        ) {
            Text(text = "Mới", color = Color.Red)
            Text(text = " . ")
            Text(text = "11 phút", color = Color.White)
        }

        Button(onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.Black,
            ),
            modifier = Modifier
                .width(380.dp)
                .padding(top = 443.dp, start = 20.dp)
        ) {
            Icon(Icons.Default.PlayArrow, contentDescription = null,
                Modifier.size(25.dp), Color.White)
            Text(text = "Xem ngay",
                color = Color.White,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Composable
fun category() {

    Column() {
        Row() {
            Text(text = "Danh mục",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 10.dp))
//            Text(text = "Xem tất cả",
//                color = Color.Black,
//                fontSize = 17.sp,
//                textAlign = TextAlign.End,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(end = 5.dp))
        }
        val categorist = remember { CategoryItems.categoryMoviesList }
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(
                items = categorist,
                itemContent = {
                    CategoryListItem(categoryMovies = it)
                }
            )
        }
    }
}

@Composable
fun newfilm() {
    Column() {
        headtitle("Mới ra mắt")
    }
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
fun animeFilm() {
    Column() {
        headtitle("Anime")
    }
    var animes = remember { FilmNewItems.filmNewList}
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = animes,
            itemContent = {
                AnimeListItem(filmNew = it)
            }
        )
    }
}



@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DoAnMobileTheme() {
        Home()
    }
}
