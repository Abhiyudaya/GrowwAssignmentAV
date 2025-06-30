package com.example.growwassignmentav.domain.repository

import com.example.growwassignmentav.data.localstorage.WatchList.WatchlistDao
import com.example.growwassignmentav.data.localstorage.WatchList.WatchlistEntity
import com.example.growwassignmentav.data.localstorage.WatchList.WatchlistStockEntity
import com.example.growwassignmentav.data.mappers.toDomain
import com.example.growwassignmentav.data.mappers.toEntity
import com.example.growwassignmentav.domain.model.Watchlist
import com.example.growwassignmentav.domain.model.WatchlistItem
import javax.inject.Inject

class WatchlistRepositoryImpl @Inject constructor(
    private val dao: WatchlistDao
) : WatchlistRepository {

    override suspend fun createWatchlist(name: String): Boolean {
        val id = dao.insertWatchlist(WatchlistEntity(name = name))
        return id != -1L
    }

    override suspend fun getAllWatchlists(): List<Watchlist> {
        return dao.getAllWatchlistss().map { it.toDomain() }
    }

    override suspend fun getWatchlistById(id: Int): Watchlist? {
        return dao.getWatchlistById(id)?.toDomain()
    }

    override suspend fun deleteWatchlist(watchlist: Watchlist) {
        dao.deleteWatchlist(watchlist.toEntity())
    }

    override suspend fun addStockToWatchlist(watchlistId: Int, symbol: String) {
        dao.addStockToWatchlist(
            WatchlistStockEntity(watchlistId = watchlistId, symbol = symbol)
        )
    }

    override suspend fun removeStockFromWatchlist(watchlistId: Int, symbol: String) {
        dao.removeStockFromWatchlist(watchlistId, symbol)
    }

    override suspend fun getSymbolsInWatchlist(watchlistId: Int): List<String> {
        return dao.getSymbolsInWatchlist(watchlistId)
    }

    override suspend fun getWatchlistsContainingStock(symbol: String): List<WatchlistItem> {
        return dao.getWatchlistsContainingStock(symbol).map { it.toDomain() }
    }
}