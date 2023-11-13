package com.example.papb11.network

import com.example.papb11.model.Users
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("data.php")
    fun getAllUsers(): Call<Users>
}