package com.nuncamaria.learninggraphql.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.nuncamaria.learninggraphql.ui.theme.LearningGraphQLTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningGraphQLTheme {
                CountriesView()
            }
        }
    }
}