package com.example.di.module

import com.example.data.api.ApiHelper
import com.example.data.api.ApiHelperImpl
import com.example.data.api.ApiService
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val BASE_URL = "https://5e510330f2c0d300147c034c.mockapi.io/"

val appModule = module {
    single {
        provideOkHttpClient()
    }
    single { provideRetrofit(get()) }
    single { provideApiService(get()) }

    single<ApiHelper> {
        ApiHelperImpl(get())
    }
}


private fun provideOkHttpClient() =
    OkHttpClient
    .Builder()
    .build()

private fun provideRetrofit(
    okHttpClient: OkHttpClient
): Retrofit =
    Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .build()

private fun provideApiService(retrofit: Retrofit): ApiService =
    retrofit.create(ApiService::class.java)
