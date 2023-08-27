package com.example.doanmobile.bottomnav


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.doanmobile.layout.Home
import com.example.doanmobile.layout.rank.RankScreen
import com.example.doanmobile.layout.setting.SettingScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route)
        {
            Home()
        }
        composable(route = BottomBarScreen.Film.route)
        {

        }
        composable(route = BottomBarScreen.Rank.route)
        {
            RankScreen()
        }
        composable(route = BottomBarScreen.Setting.route)
        {
            SettingScreen()
        }
    }
}