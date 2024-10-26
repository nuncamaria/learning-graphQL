package com.nuncamaria.learninggraphql.data.network

import com.nuncamaria.GetCountriesQuery
import com.nuncamaria.network.ApolloClient

class GetCountriesDataSource(private val client: ApolloClient) {

    suspend fun getCountries(): Result<List<GetCountriesQuery.Country>> {
        val response = client.provideApolloClient().query(GetCountriesQuery()).execute()

        response.data?.let {
            val countries = it.countries
            return Result.success(countries)
        } ?: run {
            return Result.failure(Exception(response.errors?.first()?.message))
        }
    }
}