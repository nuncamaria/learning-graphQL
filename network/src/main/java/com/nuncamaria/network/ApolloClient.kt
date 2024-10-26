package com.nuncamaria.network

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.network.okHttpClient
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

object ApolloClient {

    private const val BASE_URL = "https://countries.trevorblades.com"

    fun provideApolloClient(url: String = BASE_URL): ApolloClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val okHttp = OkHttpClient
            .Builder()
            .addInterceptor(logging)

        return ApolloClient.Builder()
            .serverUrl(url)
            .okHttpClient(okHttp.build())
            .build()
    }
}