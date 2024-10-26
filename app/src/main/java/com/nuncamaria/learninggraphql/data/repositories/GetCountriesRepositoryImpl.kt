package com.nuncamaria.learninggraphql.data.repositories

import com.nuncamaria.GetCountriesQuery
import com.nuncamaria.learninggraphql.data.network.GetCountriesDataSource
import com.nuncamaria.learninggraphql.domain.repositories.GetCountriesRepository

class GetCountriesRepositoryImpl(
    private val dataSource: GetCountriesDataSource
) : GetCountriesRepository {

    override suspend fun getCountries(): Result<List<GetCountriesQuery.Country>> =
        dataSource.getCountries()
}