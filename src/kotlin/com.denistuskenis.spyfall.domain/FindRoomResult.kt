package com.denistuskenis.spyfall.domain

import kotlinx.serialization.Serializable

@Serializable
data class FindRoomResult(
    val roomId: RoomId,
)
