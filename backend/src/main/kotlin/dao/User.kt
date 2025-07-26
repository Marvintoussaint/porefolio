package com.tinkerhouse.dao

import com.tinkerhouse.model.Products
import com.tinkerhouse.model.Users
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class User(id : EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<User>(Users)
    var firebaseUid by Users.firebaseUid
    var firstName by Users.firstName
    var lastName by Users.lastName
    var email by Users.email
    var phone by Users.phone
    var userName by Users.username
    var createdAt by Users.createdAt
    val products by Product referrersOn Products.users
}