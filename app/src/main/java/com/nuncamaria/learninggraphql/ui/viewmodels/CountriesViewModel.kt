package com.nuncamaria.learninggraphql.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nuncamaria.learninggraphql.domain.usecases.GetCountriesUseCase
import com.nuncamaria.learninggraphql.ui.CountriesState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CountriesViewModel(getCountries: GetCountriesUseCase) : ViewModel() {

    private val _state = MutableStateFlow(CountriesState())
    val state = _state.asStateFlow()

    init {
        _state.update { it.copy(isLoading = true) }

        viewModelScope.launch {
            _state.update {
                it.copy(data = getCountries())
            }
        }
    }
}