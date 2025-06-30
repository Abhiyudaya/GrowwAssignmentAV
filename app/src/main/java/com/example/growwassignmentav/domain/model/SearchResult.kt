package com.example.growwassignmentav.domain.model

data class SearchResult(
    val symbol: String,
    val name: String,
    val region: String,
    val score: Double
)