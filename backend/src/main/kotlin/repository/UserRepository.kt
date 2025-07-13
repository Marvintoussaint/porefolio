package com.tinkerhouse.repository

import com.tinkerhouse.dao.User
import com.tinkerhouse.model.Users
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

class UserRepository  {

    fun getAllUsers(): List<User> = transaction{
        User.all().toList()
    }

    fun addUser(userName: String, email: String ) = transaction{
        User.new {
            this.email = email
            this.name = userName
        }
    }
}