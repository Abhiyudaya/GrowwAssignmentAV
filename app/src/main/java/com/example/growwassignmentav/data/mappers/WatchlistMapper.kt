package com.example.growwassignmentav.data.mappers

import com.example.growwassignmentav.data.localstorage.WatchList.WatchlistEntity
import com.example.growwassignmentav.domain.model.Watchlist

fun WatchlistEntity.toDomain(): Watchlist =
    Watchlist(id = id, name = name)

fun Watchlist.toEntity(): WatchlistEntity =
    WatchlistEntity(id = id, name = name)