package com.nuncamaria.learninggraphql.ui

import com.nuncamaria.learninggraphql.domain.models.Country

data class CountriesState(
    val data: List<Country> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
