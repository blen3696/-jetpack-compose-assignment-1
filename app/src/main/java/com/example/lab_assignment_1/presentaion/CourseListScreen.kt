package com.example.lab_assignment_1.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lab_assignment_1.data.Course

@Composable
fun CourseListScreen(courses: List<Course>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        items(courses) { course ->
            CourseCard(course)
        }
    }
}

