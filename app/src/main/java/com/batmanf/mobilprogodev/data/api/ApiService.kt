package com.batmanf.mobilprogodev.data.api

import com.batmanf.mobilprogodev.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<MutableList<User>>
}