package com.tinkerhouse

import io.ktor.server.application.*
import io.ktor.server.netty.EngineMain
import io.ktor.server.routing.routing
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
    EngineMain.main(args)
}


fun Application.module() {
    configureSerialization()
    configureRouting()
    DatabaseFactory.init()

    routing {

    }
}
