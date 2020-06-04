package com.kotlinproject.cr.rest.api

import com.kotlinproject.cr.rest.model.User
import retrofit2.http.GET

interface Service {

    @GET("users")
    suspend fun getUsers(): List<User>

}