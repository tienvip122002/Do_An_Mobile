package com.example.doanmobile.layout.rank

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.doanmobile.data.rank.DataRank
import com.example.doanmobile.data.rank.Rank
import com.example.doanmobile.layout.CategoryListItem
import com.example.doanmobile.layout.Home
import com.example.doanmobile.ui.theme.DoAnMobileTheme

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun RankScreen() {
    val ranks = remember {
        DataRank.rankingList
    }

    Scaffold()
    { paddingValues ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues)
        )
        {
//            stickyHeader {
//                Card(
//                    modifier = Modifier
//                        .fillMaxHeight(),
//                    colors = CardDefaults.cardColors(Color.Black)
//                ) {
//                }
//            }
            items(ranks) { it ->
                RankListItem(it) {
                }

            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DoAnMobileTheme() {
        RankScreen()
    }
}
