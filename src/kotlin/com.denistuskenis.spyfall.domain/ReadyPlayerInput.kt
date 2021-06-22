package com.denistuskenis.spyfall.domain

import kotlinx.serialization.Serializable

@Serializable
data class ReadyPlayerInput(
    val playerId: PlayerId
)
