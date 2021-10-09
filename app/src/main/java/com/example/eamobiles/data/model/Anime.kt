package com.example.eamobiles.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "animes")
 data class Anime (
        @SerializedName("anime_id")
        @PrimaryKey
        @ColumnInfo(name = "id")
        val animeID: Long,
        @SerializedName("anime_name")
        @ColumnInfo(name = "animeName")
        val animeName: String,
        @SerializedName("anime_img")
        @ColumnInfo(name = "animeImg")
        val animeImg: String
) {

        @Ignore
        var favorite: Boolean = false
}