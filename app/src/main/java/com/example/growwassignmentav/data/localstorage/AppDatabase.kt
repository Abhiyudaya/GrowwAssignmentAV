package com.example.growwassignmentav.data.localstorage

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.growwassignmentav.data.localstorage.WatchList.WatchlistDao
import com.example.growwassignmentav.data.localstorage.WatchList.WatchlistEntity
import com.example.growwassignmentav.data.localstorage.WatchList.WatchlistStockEntity

@Database(
    entities = [
        CachedStockPerformanceEntity::class,
        WatchlistEntity::class,
        WatchlistStockEntity::class
    ],
    version = 3
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun stockPerformanceDao(): StockPerformanceDao
    abstract fun watchlistDao(): WatchlistDao
}
