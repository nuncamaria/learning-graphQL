package com.nuncamaria.learninggraphql.data.repositories

import com.nuncamaria.GetCountriesQuery
import com.nuncamaria.learninggraphql.domain.repositories.GetCountriesRepository
import com.nuncamaria.network.ApolloClient

class GetCountriesRepositoryImpl(private val client: ApolloClient) : GetCountriesRepository {

    override suspend fun getCountries(): List<GetCountriesQuery.Country> {
        val response = client.provideApolloClient().query(GetCountriesQuery()).execute()

        response.data?.let {
            val countries = it.countries
            println("Countries: $countries")

            return countries
        } ?: run {
            println("Error: ${response.errors}")
            return listOf()
        }
    }
}