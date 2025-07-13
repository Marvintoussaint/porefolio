package com.tinkerhouse.dto


import com.tinkerhouse.dao.User
import kotlinx.serialization.Serializable

@Serializable
data class UserDTO(val id: Int, val name: String, val email: String)

fun User.toDto() = UserDTO(id.value, name, email)