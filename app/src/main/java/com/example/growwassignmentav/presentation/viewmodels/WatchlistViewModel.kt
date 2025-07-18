package com.example.growwassignmentav.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.growwassignmentav.domain.model.StockPerformance
import com.example.growwassignmentav.domain.model.Watchlist
import com.example.growwassignmentav.domain.repository.WatchlistRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import com.example.growwassignmentav.utils.UiState
import javax.inject.Inject

@HiltViewModel
class WatchlistViewModel @Inject constructor(
    val repository: WatchlistRepository
) : ViewModel() {

    private val _watchlists = MutableStateFlow<List<Watchlist>>(emptyList())
    val watchlists: StateFlow<List<Watchlist>> = _watchlists.asStateFlow()

    private val _stockWatchlistIds = MutableStateFlow<List<Int>>(emptyList())
    val stockWatchlistIds: StateFlow<List<Int>> = _stockWatchlistIds.asStateFlow()

    private val _watchlistStocksState = MutableStateFlow<UiState<List<StockPerformance>>>(UiState.Loading)
    val watchlistStocksState: StateFlow<UiState<List<StockPerformance>>> = _watchlistStocksState.asStateFlow()
    init {
        loadWatchlists()
    }

    fun loadWatchlists() {
        viewModelScope.launch {
            _watchlists.value = repository.getAllWatchlists()
        }
    }

    fun createWatchlist(name: String) {
        viewModelScope.launch {
            val created = repository.createWatchlist(name)
            if (created) loadWatchlists()
        }
    }

    fun loadWatchlistsForStock(symbol: String) {
        viewModelScope.launch {
            val items = repository.getWatchlistsContainingStock(symbol)
            _stockWatchlistIds.value = items.map { it.watchlistId }
        }
    }

    fun toggleStockInWatchlist(watchlistId: Int, symbol: String, isInWatchlist: Boolean) {
        viewModelScope.launch {
            if (isInWatchlist) {
                repository.removeStockFromWatchlist(watchlistId, symbol)
            } else {
                repository.addStockToWatchlist(watchlistId, symbol)
            }
            loadWatchlistsForStock(symbol)
        }
    }

}