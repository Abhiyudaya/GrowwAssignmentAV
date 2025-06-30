package com.example.growwassignmentav.data.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

object ApiKeyProvider {
    val ALPHA_API_KEY: String
        get() = "3BU3IE38491KNRBF"
}

interface GrowwApi {

    @GET("query")
    suspend fun getTopGainersLosers(
        @Query("function") function: String = "TOP_GAINERS_LOSERS",
        @Query("apikey") apiKey: String = com.example.growwassignmentav.data.api.ApiKeyProvider.ALPHA_API_KEY

    ): Response<TopGainersLosersDto>

    @GET("query")
    suspend fun getCompanyOverview(
        @Query("function") function: String = "OVERVIEW",
        @Query("symbol") symbol: String,
        @Query("apikey") apiKey: String = com.example.growwassignmentav.data.api.ApiKeyProvider.ALPHA_API_KEY
    ): Response<CompanyOverviewDto>

    @GET("query")
    suspend fun searchStocks(
        @Query("function") function: String = "SYMBOL_SEARCH",
        @Query("keywords") keywords: String,
        @Query("apikey") apiKey: String = com.example.growwassignmentav.data.api.ApiKeyProvider.ALPHA_API_KEY
    ): Response<SearchResultDto>

    @GET("query")
    suspend fun getTimeSeriesDaily(
        @Query("function") function: String = "TIME_SERIES_DAILY",
        @Query("symbol") symbol: String,
        @Query("outputsize") outputSize: String = "compact",
        @Query("apikey") apiKey: String = com.example.growwassignmentav.data.api.ApiKeyProvider.ALPHA_API_KEY
    ): Response<TimeSeriesDto>
    @GET("query")
    suspend fun getTimeSeriesIntraday(
        @Query("function") function: String = "TIME_SERIES_INTRADAY",
        @Query("symbol") symbol: String,
        @Query("interval") interval: String = "5min",
        @Query("outputsize") outputSize: String = "compact",
        @Query("apikey") apiKey: String = com.example.growwassignmentav.data.api.ApiKeyProvider.ALPHA_API_KEY
    ): Response<TimeSeriesDto>

    @GET("query")
    suspend fun getTimeSeriesWeekly(
        @Query("function") function: String = "TIME_SERIES_WEEKLY",
        @Query("symbol") symbol: String,
        @Query("apikey") apiKey: String = com.example.growwassignmentav.data.api.ApiKeyProvider.ALPHA_API_KEY
    ): Response<TimeSeriesDto>

    @GET("query")
    suspend fun getTimeSeriesMonthly(
        @Query("function") function: String = "TIME_SERIES_MONTHLY",
        @Query("symbol") symbol: String,
        @Query("apikey") apiKey: String = com.example.growwassignmentav.data.api.ApiKeyProvider.ALPHA_API_KEY
    ): Response<TimeSeriesDto>
}