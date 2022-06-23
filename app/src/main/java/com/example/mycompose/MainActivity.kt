package com.example.mycompose

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycompose.counter.CounterApp
import com.example.mycompose.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CounterApp()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column() {
        Text(text = "Hello 2  $name!")
        Text(text = "Hello 1$name!")
        ShowTitle("Kumar")
    }

}

@Composable
fun ShowTitle(title : String){
    Row() {
        Text(text = "Hello Boss Compose")
        Text(text = "Ok")
        Text(text = "$title!")
        Column() {
            Text(text = "Next line1")
            Text(text = "Next line2")
        }
    }

}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeTheme {
        CounterApp()
    }
}