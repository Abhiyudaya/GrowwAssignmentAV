package com.example.growwassignmentav.domain.model

data class StockPerformance(
    val ticker: String,
    val price: Double,
    val changeAmount: Double,
    val changePercentage: Double,
    val volume: Long,
    val isGainer: Boolean = false,
    val isLoser: Boolean = false
)