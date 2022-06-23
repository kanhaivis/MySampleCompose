package com.example.mycompose.counter

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CounterApp(){
    Scaffold(
        topBar = {
           LargeTopAppBar(
               title = { Text(text = "Counter App") }
           )
        },
        floatingActionButton =  {
            FloatingActionButton(onClick = { /*TODO*/ }) {

            }
        }

    ){


    }
}