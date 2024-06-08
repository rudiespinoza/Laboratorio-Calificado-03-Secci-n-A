package com.espinoza.rudencio.laboratoriocalificado03

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("/list/teacher")
    suspend fun getTeachers(): Response<LisTeacher>

}