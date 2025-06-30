package com.example.growwassignmentav.data.mappers

import com.example.growwassignmentav.data.dto.StockSearchItemDto
import com.example.growwassignmentav.domain.model.SearchResult


fun StockSearchItemDto.toDomain(): SearchResult {
    return SearchResult(
        symbol = symbol.orEmpty(),
        name = name.orEmpty(),
        region = region.orEmpty(),
        score = score?.toDoubleOrNull() ?: 0.0
    )
}
