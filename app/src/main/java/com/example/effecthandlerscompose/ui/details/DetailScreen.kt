package com.example.effecthandlerscompose.ui.details

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailScreen(navController: NavController) {
//    val scaffoldState = rememberScaffoldState()

    // Use LaunchedEffect to show a SnackBar
//    LaunchedEffect(Unit) {
//        scaffoldState.snackbarHostState.showSnackbar(
//            message = "Welcome to the Details Screen!",
//            actionLabel = "OK"
//        )
//    }

    Scaffold(
//        scaffoldState = scaffoldState,
        topBar = { TopAppBar(title = { Text("Detail Screen") }) }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { navController.navigate("home") }) {
                Text("Back to Home")
            }
        }
    }
}