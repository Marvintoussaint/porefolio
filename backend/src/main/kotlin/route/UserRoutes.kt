package com.tinkerhouse.route

import com.tinkerhouse.dto.UserRequest
import com.tinkerhouse.dto.toDto
import com.tinkerhouse.repository.UserRepository
import io.ktor.http.HttpMessage
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.route
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import java.net.http.HttpResponse

val UserRepository = UserRepository()

fun Route.userRoutes() {

    route("/user") {

        get {
            val users = UserRepository.getAllUsers().map { it.toDto() }
            call.respond(HttpStatusCode.OK, users)
        }

        post {
            val request = call.receive<UserRequest>()
            val user = UserRepository.addUser(request.name,request.email)
            call.respond(HttpStatusCode.Created, user.toDto())
        }
    }



}