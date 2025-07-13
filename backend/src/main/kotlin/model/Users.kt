package com.tinkerhouse.model

import org.jetbrains.exposed.dao.id.IntIdTable

object Users : IntIdTable("users") {
    val name = varchar("name", 50)
    val email = varchar("email", 50)
}