package com.nuncamaria.learninggraphql.domain.models

data class Country(
    val code: String,
    val name: String,
    val capital: String,
    val emoji: String,
    val languages: List<String>,
)
