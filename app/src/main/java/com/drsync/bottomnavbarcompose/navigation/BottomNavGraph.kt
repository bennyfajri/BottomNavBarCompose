package com.drsync.bottomnavbarcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.drsync.bottomnavbarcompose.screens.HomeScreen
import com.drsync.bottomnavbarcompose.screens.ProfileScreen
import com.drsync.bottomnavbarcompose.screens.SettingScreen

@Composable
fun BottomNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingScreen()
        }
    }

}