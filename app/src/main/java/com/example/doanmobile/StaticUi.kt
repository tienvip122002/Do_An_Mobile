package com.example.doanmobile

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun headtitle(text: String) {
    Row() {
        Text(text = text,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 10.dp))
            Text(text = "Xem tất cả",
                color = Color.Black,
                fontSize = 17.sp,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 5.dp))
    }
}

@Composable
fun TextSetting(text: String) {
    Text(text = text, modifier = Modifier.padding(start = 12.dp).width(290.dp),
        fontWeight = FontWeight.Bold,)
    Icon(painter = painterResource(id = R.drawable.baseline_navigate_next_24), contentDescription = null,
        modifier = Modifier.padding(start = 5.dp))
}