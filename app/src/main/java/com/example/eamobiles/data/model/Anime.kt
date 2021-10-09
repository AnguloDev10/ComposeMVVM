package com.example.eamobiles.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import com.google.gson.annotations.SerializedName

@Entity(tableName = "animes")
data class Anime (
        @SerializedName("animeID")
        @ColumnInfo(name = "id")
        val animeID: Long,
        @SerializedName("animeName")
        @ColumnInfo(name = "animeName")
        val animeName: String,
        @SerializedName("animeImg")
        @ColumnInfo(name = "animeImg")
        val animeImg: String
) {
        @Ignore
        var favorite: Boolean = false
}