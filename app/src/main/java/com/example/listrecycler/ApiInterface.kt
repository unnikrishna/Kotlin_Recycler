package com.example.listrecycler

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("api/f1/2004/1/results.json")
    fun getData(): Call<MyData>
}