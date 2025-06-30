package com.example.growwassignmentav.data.mappers

import com.example.growwassignmentav.data.localstorage.CachedStockPerformanceEntity
import com.example.growwassignmentav.domain.model.StockPerformance

fun StockPerformance.toEntity(cachedAt: Long): CachedStockPerformanceEntity =
    CachedStockPerformanceEntity(id=0,
        ticker, price, changeAmount, changePercentage, volume, isGainer, isLoser, cachedAt
    )

fun CachedStockPerformanceEntity.toDomain(): StockPerformance =
    StockPerformance(ticker, price, changeAmount, changePercentage, volume, isGainer, isLoser)
