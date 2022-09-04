package com.nikhilanand.newsapp.api

import com.nikhilanand.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {


//    https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=cb246f27bc8b436280d08985713a5928


    @GET("/top_headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode: String = "india",
        @Query("category") category: String = "tech",
        @Query("page") pageNumber: Int,
        @Query("apiKey") apiKey: String = API_KEY


    ): Response<NewsAPI>


    @GET("/everything")
    suspend fun getSearchNews(
        @Query("q") searchQuery: String,
        @Query("page") pageNumber: Int,
        @Query("apiKey") apiKey: String = API_KEY


    ): Response<NewsAPI>


}