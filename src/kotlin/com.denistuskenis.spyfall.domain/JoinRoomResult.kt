package com.denistuskenis.spyfall.domain

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class JoinRoomResult {

    @Serializable
    @SerialName("Success")
    object Success: JoinRoomResult()

    @Serializable
    @SerialName("RoomNotFound")
    object RoomNotFound: JoinRoomResult()
}
