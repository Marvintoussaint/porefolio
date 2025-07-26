package com.tinkerhouse.repository

import com.tinkerhouse.dao.Product
import com.tinkerhouse.dao.User
import com.tinkerhouse.model.Products
import com.tinkerhouse.model.Users
import org.jetbrains.exposed.sql.transactions.transaction

class ProductRepository  {

    // get all Products for a specific user
    fun getProductsByUserId(userId:Int): List<Product> = transaction {
        User.findById(userId)?.products?.toList() ?: emptyList()
    }
}