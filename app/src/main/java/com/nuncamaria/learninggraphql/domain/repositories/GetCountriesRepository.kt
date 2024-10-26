package com.nuncamaria.learninggraphql.domain.repositories

import com.nuncamaria.GetCountriesQuery

interface GetCountriesRepository {

    suspend fun getCountries(): List<GetCountriesQuery.Country>
}