package com.nuncamaria.learninggraphql.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nuncamaria.learninggraphql.domain.usecases.GetCountriesUseCase
import kotlinx.coroutines.launch

class CountriesViewModel(getCountries: GetCountriesUseCase) : ViewModel() {

    init {
        viewModelScope.launch {
            getCountries()
        }
    }
}