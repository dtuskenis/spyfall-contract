package com.denistuskenis.spyfall.domain

import kotlinx.serialization.Serializable

@Serializable
data class CheckRoomInput(
    val playerId: PlayerId,
)
