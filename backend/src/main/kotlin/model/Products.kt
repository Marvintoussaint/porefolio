package com.tinkerhouse.model

import com.tinkerhouse.enums.ProductCategory
import org.jetbrains.exposed.dao.id.IntIdTable

object Products : IntIdTable() {
    val user = reference("user_id", Users) // Foreign Key with Users table
    val productName = varchar("productName", 255)
    val productDescription = varchar("productDescription", 255)
    val brandName = varchar("brandName", 255).nullable()
    val category = enumerationByName("category", 50, ProductCategory::class)
    val notes = varchar("notes", 255).nullable()
    val startDate = varchar("startDate", 255).nullable()
    val endDate = varchar("endDate", 255).nullable()
}