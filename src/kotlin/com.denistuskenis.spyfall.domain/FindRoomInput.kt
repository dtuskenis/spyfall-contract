package com.denistuskenis.spyfall.domain

import kotlinx.serialization.Serializable

@Serializable
data class FindRoomInput(
    val playerId: String,
)
