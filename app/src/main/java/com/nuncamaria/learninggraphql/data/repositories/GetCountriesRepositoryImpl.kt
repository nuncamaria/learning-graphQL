package com.nuncamaria.learninggraphql.data.repositories

import com.apollographql.apollo.ApolloClient
import com.nuncamaria.GetCountriesQuery
import com.nuncamaria.learninggraphql.domain.repositories.GetCountriesRepository

class GetCountriesRepositoryImpl(private val apolloClient: ApolloClient) : GetCountriesRepository {

    override suspend fun getCountries(): List<GetCountriesQuery.Country> =
        apolloClient
            .query(GetCountriesQuery())
            .execute()
            .data
            ?.countries
            ?: emptyList()
}