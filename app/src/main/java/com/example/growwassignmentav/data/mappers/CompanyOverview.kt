package com.example.growwassignmentav.data.mappers

import com.example.growwassignmentav.data.dto.CompanyOverviewDto
import com.example.growwassignmentav.domain.model.Company

fun CompanyOverviewDto.toDomain(): Company {
    return Company(
        symbol = symbol.orEmpty(),
        name = name.orEmpty(),
        description = description.orEmpty(),
        sector = sector.orEmpty(),
        marketCap = marketCap.orEmpty(),
        peRatio = peRatio.orEmpty(),
        dividendYield = dividendYield.orEmpty()
    )
}