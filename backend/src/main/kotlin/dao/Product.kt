package com.tinkerhouse.dao

import com.tinkerhouse.model.Products
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Product(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Product>(Products)

    var productName by Products.productName
    var startDate by Products.startDate
    var endDate by Products.endDate
    var notes by Products.notes
    var category by Products.category
}