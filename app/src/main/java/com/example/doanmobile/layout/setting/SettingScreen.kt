package com.example.doanmobile.layout.setting

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.doanmobile.R
import com.example.doanmobile.TextSetting
import com.example.doanmobile.layout.Home
import com.example.doanmobile.ui.theme.DoAnMobileTheme

@Composable
fun SettingScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.baseline_person_pin_24), contentDescription = null,
                modifier = Modifier.size(50.dp))
            Text(text = "Đăng nhập",
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                fontSize = 22.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 6.dp, top = 8.dp))
        }
        Text(text = "Thông tin tài khoản", modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            fontSize = 20.sp,)
        Column() {
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_person_pin_24), contentDescription = null)
                TextSetting("Thông tin tài khoản")
            }
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_person_pin_24), contentDescription = null)
                TextSetting("Nhập mã kích hoạt")
            }
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_person_pin_24), contentDescription = null)
                TextSetting("Lịch sử giao dịch")
            }
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_person_pin_24), contentDescription = null)
                TextSetting("Quản lý thiết bị")
            }
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_person_pin_24), contentDescription = null)
                TextSetting("Dịch vụ đã mua")
            }
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_person_pin_24), contentDescription = null)
                TextSetting("Giới thiệu bạn bè")
            }
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_person_pin_24), contentDescription = null)
                TextSetting("Tải xuống")
            }
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.baseline_person_pin_24), contentDescription = null)
                TextSetting("Hỗ trợ ")
            }
        }
        Box {
            Text(text = "Ứng dụng",
                modifier = Modifier
                    .fillMaxWidth()
                .padding(start = 16.dp, top = 20.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                fontSize = 20.sp,)

        }
    }

}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DoAnMobileTheme() {
        SettingScreen()
    }
}

