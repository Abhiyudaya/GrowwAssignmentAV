# Android Stocks & ETFs Broking App  
**Assessment by:** Abhiyudaya Vatsa  
📞 6392224552  


## 🏗️ Project Layout

com.example.GrowwApp/
├── data/
│   ├── api/GrowwApi.kt
│   ├── local/
│   │   ├── WatchList/WatchlistDao.kt
│   │   └── StockPerformanceDao.kt
│   └── dto/
│       ├── CompanyOverviewDto.kt
│       ├── SearchResultDto.kt
│       └── TimeSeriesDto.kt
│
├── di/
│   ├── DatabaseModule.kt
│   ├── NetworkModule.kt
│   └── RepositoryModule.kt
│
├── domain/
│   ├── model/ (e.g., StockPerformance.kt, Company.kt)
│   └── repository/ (interfaces)
│
├── presentation/
│   ├── ui/ (screens, composables)
│   └── viewmodels/
│       ├── ExploreViewModel.kt
│       └── ProductViewModel.kt
│
├── utils/
│   └── UiState.kt
```

---

## 🔍 Key Features

1. **Top Gainers & Losers**  
   - Two horizontal carousels  
   - Caching (30 min) + live API fallback  

2. **Watchlist Management**  
   - Create & view custom watchlists  
   - Persistent with Room  

3. **Stock Detail Screen**  
   - Interactive time‑range selector (1D, 1W, 1M, 1Y, 5Y, All)  
   - Custom Canvas chart component  
   - Company overview & metrics  

4. **Add to Watchlist Dialog**  
   - In‑screen modal for quick watchlist toggles  

5. **“View All” Paginated Lists**  
   - Client‑side pagination  
   - Smooth page indicators & jump‑to‑top  

---

## 🛠️ Tech Stack

- **Language:** Kotlin  
- **UI:** Jetpack Compose (Material3)  
- **Architecture:** MVVM + Clean Architecture  
- **DI:** Hilt  
- **Network:** Retrofit → Alpha Vantage API  
- **Local Cache:** Room  

---

## ⚙️ Setup & Run

1. **Clone repo**  
   ```bash
   git clone https://github.com/SHRAVANBISEN/GrowwAssignment.git
   cd GrowwAssignment
Open in Android Studio (Arctic Fox or newer)

Insert API Key

Open StockApi.kt

Replace "REPLACE_ME_WITH_ANY_VALID_KEY" with one of:

YGAUA4QIJT79XKT3

MV77X9L60L0W8CO6

3BU3IE38491KNRBF

Build & Deploy

Sync Gradle

Run on emulator or physical device

✔️ Testing
Unit tests:

bash
Copy
Edit
./gradlew test
Instrumented/UI tests:

bash
Copy
Edit
./gradlew connectedAndroidTest
📈 Future Plans
⚡ Real‑time WebSocket feed integration

📊 Advanced charting (MA, RSI)

💼 Portfolio & P&L tracking

📰 News & alerts

🔒 Biometric login

Thank you for your time and feedback!
