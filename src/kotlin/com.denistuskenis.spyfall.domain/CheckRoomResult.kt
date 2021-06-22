package com.denistuskenis.spyfall.domain

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class CheckRoomResult {

    @Serializable
    @SerialName("Waiting")
    data class Waiting(
        val numberOfPlayers: Int,
        val numberOfReadyPlayers: Int,
    ) : CheckRoomResult()

    @Serializable
    sealed class GameStarted : CheckRoomResult() {

        abstract val cardBackImagePath: String

        @Serializable
        @SerialName("AsSpy")
        data class AsSpy(
            override val cardBackImagePath: String,
            val cardFrontImagePath: String,
        ) : GameStarted()

        @Serializable
        @SerialName("AsCivil")
        data class AsCivil(
            override val cardBackImagePath: String,
            val role: String,
            val locationName: String,
            val locationImagePath: String,
        ) : GameStarted()
    }

    @Serializable
    @SerialName("PlayerNotInRoom")
    object PlayerNotInRoom : CheckRoomResult()
}
