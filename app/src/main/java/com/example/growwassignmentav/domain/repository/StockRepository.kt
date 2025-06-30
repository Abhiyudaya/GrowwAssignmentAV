package com.example.growwassignmentav.domain.repository

import com.example.growwassignmentav.domain.model.Company
import com.example.growwassignmentav.domain.model.PricePoint
import com.example.growwassignmentav.domain.model.SearchResult
import com.example.growwassignmentav.domain.model.StockPerformance

interface StockRepository {
    suspend fun searchStocks(query: String): List<SearchResult>
    suspend fun getCompanyOverview(symbol: String): Company


    suspend fun getIntradayPrices(symbol: String, interval: String = "5min"): List<PricePoint>
    suspend fun getDailyPrices(symbol: String): List<PricePoint>
    suspend fun getWeeklyPrices(symbol: String): List<PricePoint>
    suspend fun getMonthlyPrices(symbol: String): List<PricePoint>

    suspend fun getTopGainersAndLosers(): Result<Pair<List<StockPerformance>, List<StockPerformance>>>
    suspend fun getTopGainers(): Result<List<StockPerformance>>
    suspend fun getTopLosers(): Result<List<StockPerformance>>
}