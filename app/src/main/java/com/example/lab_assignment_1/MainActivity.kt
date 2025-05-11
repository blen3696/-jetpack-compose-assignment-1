package com.example.lab_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.lab_assignment_1.data.Course
import com.example.lab_assignment_1.presentation.CourseListScreen
import com.example.lab_assignment_1.presentation.LandingPage
import com.example.lab_assignment_1.ui.theme.Lab_assignment_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab_assignment_1Theme {
                var navigateToCourseList by remember { mutableStateOf(false) }

                if (navigateToCourseList) {
                    val courses = listOf(
                        Course("Mobile Development", "CS101", 3, "Intro to Android development", "None"),
                        Course("Data Structures", "CS201", 4, "Covers lists, trees, graphs, etc.", "CS101"),
                        Course("Databases", "CS301", 3, "Covers SQL, NoSQL, normalization", "CS201"),
                        Course("Operating Systems", "CS302", 4, "Processes, memory, file systems", "CS201"),
                        Course("Web Development", "CS303", 3, "HTML, CSS, JavaScript basics", "None"),
                        Course("Algorithms", "CS304", 4, "Sorting, searching, dynamic programming", "CS201"),
                        Course("Cybersecurity", "CS402", 3, "Encryption, threats, risk management", "CS305")
                    )
                    CourseListScreen(courses)
                } else {
                    LandingPage(onStartClick = { navigateToCourseList = true })
                }
            }
        }
    }
}




