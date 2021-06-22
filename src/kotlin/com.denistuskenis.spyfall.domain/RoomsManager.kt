package com.denistuskenis.spyfall.domain

interface RoomsManager {

    suspend fun search(): List<Room>

    suspend fun create(input: CreateRoomInput): RoomId

    suspend fun join(input: JoinRoomInput): JoinRoomResult

    suspend fun check(input: CheckRoomInput): CheckRoomResult

    suspend fun ready(input: ReadyPlayerInput)

    suspend fun locations(): List<GameLocation>
}
