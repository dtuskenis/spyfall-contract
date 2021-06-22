package com.denistuskenis.spyfall.domain

import kotlinx.serialization.Serializable

@Serializable
data class GameLocation(
    val name: String,
    val imagePath: String,
    val civilRoles: List<GameRole.Civil>
)
