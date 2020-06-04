package com.kotlinproject.cr.rest.repo

import com.kotlinproject.cr.rest.api.Helper


class Repository(private val helper: Helper) {

    suspend fun getUsers() = helper.getUsers()
}