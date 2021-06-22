package com.denistuskenis.spyfall.domain

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class GameRole {

    @Serializable
    @SerialName("Spy")
    object Spy : GameRole()

    @Serializable
    @SerialName("Civil")
    data class Civil(
        val role: String,
    ) : GameRole()
}
