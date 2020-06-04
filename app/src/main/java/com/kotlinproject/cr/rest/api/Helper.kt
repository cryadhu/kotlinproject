package com.kotlinproject.cr.rest.api

class Helper(private val service: Service) {

    suspend fun getUsers() = service.getUsers()
}