package com.example.eamobiles.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


class Team (
        @SerializedName("id")
        val id : Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("image_url")
        val  image_url: String,
        @SerializedName("players")
        val players: List<Player>
) {
        constructor() : this(0, "","", listOf())

}
@Entity(tableName = "players")
class Player(

        @PrimaryKey
        val id: Int,

        @ColumnInfo(name="name")
        val name: String,

        @ColumnInfo(name="last_name")
        val lastname: String,

        @ColumnInfo(name="first_name")
        val first_name: String,

        @ColumnInfo(name="image_url")
        val image_url: String
) {
        @Ignore
        var favorite: Boolean = false

        constructor() : this(0,"","","","")

}
