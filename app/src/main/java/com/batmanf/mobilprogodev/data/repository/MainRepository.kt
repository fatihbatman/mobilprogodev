package com.batmanf.mobilprogodev.data.repository

import com.batmanf.mobilprogodev.data.api.RetrofitBuilder

class MainRepository {
    suspend fun getUsers() = RetrofitBuilder.api.getUsers()
}