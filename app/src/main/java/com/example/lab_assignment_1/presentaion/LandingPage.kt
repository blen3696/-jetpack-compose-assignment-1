package com.example.lab_assignment_1.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.LaunchedEffect

@Composable
fun LandingPage(onStartClick: () -> Unit) {
    var isTextVisible by remember { mutableStateOf(false) }


    LaunchedEffect(Unit) {
        isTextVisible = true
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AnimatedVisibility(
            visible = isTextVisible,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Text(
                text = "Welcome to the Course App!",
                style = MaterialTheme.typography.titleLarge.copy(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = onStartClick,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Proceed to Course List")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LandingPagePreview() {
    LandingPage(onStartClick = {})
}


