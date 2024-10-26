package com.nuncamaria.learninggraphql.domain.usecases

import com.nuncamaria.learninggraphql.domain.models.Country
import com.nuncamaria.learninggraphql.domain.models.mappers.toModel
import com.nuncamaria.learninggraphql.domain.repositories.GetCountriesRepository

class GetCountriesUseCase(private val repository: GetCountriesRepository) {

    suspend operator fun invoke(): Result<List<Country>> =
        repository.getCountries().map {
            it.map { country -> country.toModel() }
        }
}
