package com.example.recipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private val retrofit = Retrofit.Builder().baseUrl("https://evaluare.prasada.md/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeService = retrofit.create(ApiService::class.java)

interface ApiService {
    @GET("Anghelina/api/cat/breeds")
    suspend fun getCategories(): CategoriesResponse

}