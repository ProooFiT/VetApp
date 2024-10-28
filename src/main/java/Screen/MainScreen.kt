//package com.example.vetapp
//
//import androidx.activity.viewModels
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.lifecycle.viewmodel.compose.viewModel
//import com.example.navhost.AuthViewModel
//import com.example.navhost.BottomNavigationTheme
//import com.example.navhost.MyAppNavigation
//
//@Composable
//    fun MainScreen(
//
//    ){
//    val authViewModel: AuthViewModel = viewModel()
//
//
//    Scaffold(modifier = Modifier.fillMaxSize(), bottomBar = { BottomNavigationTheme(navController = navController  ) }) { innerPadding ->
//        MyAppNavigation(modifier = Modifier.padding(innerPadding),authViewModel = authViewModel)
//    }
//    }
