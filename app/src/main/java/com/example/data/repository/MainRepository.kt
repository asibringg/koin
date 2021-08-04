package com.example.data.repository

import com.example.data.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper) {
    suspend fun getUsers() =  apiHelper.getUsers()
}