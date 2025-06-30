package com.example.growwassignmentav.data.mappers

import com.example.growwassignmentav.data.localstorage.WatchList.WatchlistStockEntity
import com.example.growwassignmentav.domain.model.WatchlistItem

fun WatchlistStockEntity.toDomain(): WatchlistItem =
    WatchlistItem(watchlistId = watchlistId, symbol = symbol)

fun WatchlistItem.toEntity(): WatchlistStockEntity =
    WatchlistStockEntity(watchlistId = watchlistId, symbol = symbol)
