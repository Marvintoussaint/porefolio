package com.tinkerhouse.model

import org.jetbrains.exposed.dao.id.IntIdTable

object Users : IntIdTable("users") {
    val firebaseUid = varchar("firebase_uid", 128).uniqueIndex()
    val firstName = varchar("first_name", 50).nullable()
    val lastName = varchar("last_name", 50).nullable()
    val email = varchar("email", 50).nullable()
    val phone = varchar("phone", 50).nullable()
    val username = varchar("username", 50).nullable()
    val createdAt = varchar("created_at", 50).nullable()
}