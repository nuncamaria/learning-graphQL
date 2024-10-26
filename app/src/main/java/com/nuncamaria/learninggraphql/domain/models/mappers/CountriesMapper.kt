package com.nuncamaria.learninggraphql.domain.models.mappers

import com.nuncamaria.GetCountriesQuery
import com.nuncamaria.GetCountryQuery
import com.nuncamaria.learninggraphql.domain.models.Country

fun GetCountriesQuery.Country.toModel(): Country =
    Country(
        code = code,
        name = name,
        capital = capital ?: "No capital",
        emoji = emoji,
        languages = languages.map { it.name }
    )

fun GetCountryQuery.Country.toModel(): Country =
    Country(
        code = code,
        name = name,
        capital = capital ?: "No capital",
        emoji = emoji,
        languages = languages.map { it.name }
    )