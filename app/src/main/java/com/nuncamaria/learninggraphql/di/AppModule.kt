package com.nuncamaria.learninggraphql.di

import com.nuncamaria.learninggraphql.data.repositories.GetCountriesRepositoryImpl
import com.nuncamaria.learninggraphql.domain.repositories.GetCountriesRepository
import com.nuncamaria.learninggraphql.domain.usecases.GetCountriesUseCase
import com.nuncamaria.learninggraphql.ui.viewmodels.CountriesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single<GetCountriesRepository> { GetCountriesRepositoryImpl() }

    single { GetCountriesUseCase(get()) }

    viewModel { CountriesViewModel(get()) }
}