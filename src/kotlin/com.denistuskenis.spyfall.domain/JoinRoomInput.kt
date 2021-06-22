package com.denistuskenis.spyfall.domain

import kotlinx.serialization.Serializable

@Serializable
data class JoinRoomInput(
    val roomId: String,
    val playerId: String,
)
