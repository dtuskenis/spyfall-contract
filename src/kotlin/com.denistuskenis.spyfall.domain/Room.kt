package com.denistuskenis.spyfall.domain

import kotlinx.serialization.Serializable

typealias RoomId = String

@Serializable
data class Room(
    val id: RoomId,
    val name: String,
)
