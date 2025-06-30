package com.example.growwassignmentav.di

import com.example.growwassignmentav.data.api.StockApi
import com.example.growwassignmentav.data.localstorage.StockPerformanceDao
import com.example.growwassignmentav.data.localstorage.WatchList.WatchlistDao
import com.example.growwassignmentav.domain.repository.StockRepository
import com.example.growwassignmentav.domain.repository.StockRepositoryImpl
import com.example.growwassignmentav.domain.repository.WatchlistRepository
import com.example.growwassignmentav.domain.repository.WatchlistRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideStockRepository(
        api: StockApi,
        stockDao: StockPerformanceDao
    ): StockRepository {
        return StockRepositoryImpl(api, stockDao)
    }

    @Provides
    @Singleton
    fun provideWatchlistRepository(
        dao: WatchlistDao
    ): WatchlistRepository = WatchlistRepositoryImpl(dao)

}