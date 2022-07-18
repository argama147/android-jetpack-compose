package com.eugo.composebox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eugo.composebox.ui.theme.ComposeBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBoxTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BoxExamples()
                }
            }
        }
    }
}

@Composable
fun BoxExamples() {
    Row(Modifier.background(color=Color.Black)){
        Column {
            BoxExample(Alignment.TopStart)
            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .width(30.dp)
            )
            BoxExample(Alignment.TopCenter)
            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .width(30.dp)
            )
            BoxExample(Alignment.TopEnd)
        }
        Spacer(
            modifier = Modifier
                .height(93.dp)
                .width(1.dp)
        )
        Column {
            BoxExample(Alignment.CenterStart)
            Spacer(modifier = Modifier
                .height(1.dp)
                .width(30.dp)
            )
            BoxExample(Alignment.Center)
            Spacer(modifier = Modifier
                .height(1.dp)
                .width(30.dp)
            )
            BoxExample(Alignment.CenterEnd)
        }
        Spacer(
            modifier = Modifier
                .height(93.dp)
                .width(1.dp)
        )
        Column {
            BoxExample(Alignment.BottomStart)
            Spacer(modifier = Modifier
                .height(1.dp)
                .width(30.dp)
            )
            BoxExample(Alignment.BottomCenter)
            Spacer(modifier = Modifier
                .height(1.dp)
                .width(30.dp)
            )
            BoxExample(Alignment.BottomEnd)
        }
    }
}

@Composable
fun BoxExample(contentAlignment: Alignment) {
    Box(
        modifier = Modifier
            .size(30.dp)
            .background(Color.White),
        contentAlignment = contentAlignment
    ) {
        Box(
            modifier = Modifier
                .size(20.dp)
                .background(Color.LightGray)
        )
        Box(
            modifier = Modifier
                .size(10.dp)
                .background(Color.Gray)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BoxExamplePreview() {
    ComposeBoxTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            BoxExamples()
        }
    }

}