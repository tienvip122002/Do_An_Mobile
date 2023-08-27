package com.example.doanmobile.bottomnav

import com.example.doanmobile.R


sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {
    // home
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.baseline_home_24,
        icon_focused = R.drawable.baseline_home_24
    )
    // film
    object Film: BottomBarScreen(
        route = "movie",
        title = "Movie",
        icon = R.drawable.baseline_local_movies_24,
        icon_focused = R.drawable.baseline_local_movies_24
    )
    // Rank
    object Rank: BottomBarScreen(
        route = "rank",
        title = "Rank",
        icon = R.drawable.baseline_equalizer_24,
        icon_focused = R.drawable.baseline_equalizer_24
    )
    // setting
    object Setting: BottomBarScreen(
        route = "setting",
        title = "Setting",
        icon = R.drawable.baseline_settings_24,
        icon_focused = R.drawable.baseline_settings_24
    )
}
