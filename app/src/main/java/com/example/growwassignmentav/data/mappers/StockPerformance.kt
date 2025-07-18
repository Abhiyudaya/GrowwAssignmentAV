package com.example.growwassignmentav.data.mappers

import com.example.growwassignmentav.data.dto.StockPerformanceDto
import com.example.growwassignmentav.domain.model.StockPerformance

fun StockPerformanceDto.toDomain(isGainer: Boolean = false, isLoser: Boolean = false): StockPerformance {
    println("Mapping: ticker=$ticker, price=$price, change=$changePercentage")

    return StockPerformance(
        ticker = ticker,
        price = price.toDoubleOrNull() ?: 0.0,
        changeAmount = changeAmount.toDoubleOrNull() ?: 0.0,
        changePercentage = changePercentage.removeSuffix("%").toDoubleOrNull() ?: 0.0,
        volume = volume.toLongOrNull() ?: 0L,
        isGainer = isGainer,
        isLoser = isLoser
    )
}