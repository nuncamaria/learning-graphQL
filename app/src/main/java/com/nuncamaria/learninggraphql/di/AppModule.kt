package com.nuncamaria.learninggraphql.di

import com.nuncamaria.learninggraphql.data.repositories.GetCountriesRepositoryImpl
import com.nuncamaria.learninggraphql.domain.repositories.GetCountriesRepository
import com.nuncamaria.learninggraphql.domain.usecases.GetCountriesUseCase
import com.nuncamaria.learninggraphql.ui.viewmodels.CountriesViewModel
import com.nuncamaria.network.ApolloClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { ApolloClient }

    single<GetCountriesRepository> { GetCountriesRepositoryImpl(get()) }

    single { GetCountriesUseCase(get()) }

    viewModel { CountriesViewModel(get()) }
}