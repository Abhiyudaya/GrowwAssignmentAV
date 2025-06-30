package com.example.growwassignmentav.data.localstorage.Wishlist

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wishlists")
data class WishListEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val createdAt: Long = System.currentTimeMillis()
)