package com.example.growwassignmentav.domain.model

data class Company(
    val symbol: String,
    val name: String,
    val description: String,
    val sector: String,
    val marketCap: String,
    val peRatio: String,
    val dividendYield: String
)