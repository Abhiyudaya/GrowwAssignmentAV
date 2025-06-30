package com.example.growwassignmentav.data.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CompanyOverviewDTO(
    @Json(name = "Symbol") val symbol: String?,
    @Json(name = "Name") val name: String?,
    @Json(name = "Description") val description: String?,
    @Json(name = "Sector") val sector: String?,
    @Json(name = "MarketCapitalization") val marketCap: String?,
    @Json(name = "PERatio") val peRatio: String?,
    @Json(name = "DividendYield") val dividendYield: String?
)