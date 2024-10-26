package com.nuncamaria.learninggraphql.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.nuncamaria.learninggraphql.ui.viewmodels.CountriesViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun CountriesView(viewModel: CountriesViewModel = koinViewModel()) {

    val state = viewModel.state.collectAsStateWithLifecycle()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            items(state.value.data) { country ->
                CountryItem(country = country.name)
            }
        }
    }
}

@Composable
fun CountryItem(country: String) {
    Text(text = country)
}
