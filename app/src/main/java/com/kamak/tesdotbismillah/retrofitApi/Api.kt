package com.kamak.tesdotbismillah.retrofitApi

import com.kamak.tesdotbismillah.Header
import com.kamak.tesdotbismillah.Place
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object Api {
    fun getInterceptor(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()
        return okHttpClient
    }


    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://dot-mobile-test.web.app/")
                .client(getInterceptor())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
    fun getServicee() = getRetrofit().create(ApiService::class.java)!!
}
interface ApiService{
    @GET("place.json")
    fun getStatus():
            Call<Place>
    @GET("place.json")
    fun getHeader():
            Call<Header>


}

