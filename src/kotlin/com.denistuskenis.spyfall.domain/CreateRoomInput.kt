package com.denistuskenis.spyfall.domain

import kotlinx.serialization.Serializable

@Serializable
data class CreateRoomInput(
    val roomName: String,
)
