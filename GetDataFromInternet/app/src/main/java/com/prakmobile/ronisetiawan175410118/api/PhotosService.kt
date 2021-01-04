package com.prakmobile.ronisetiawan175410118.api

import android.provider.ContactsContract
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class PhotosService {
    private val BASE_URL = "https://jsonplaceholder.typicode.com/"
    private val api: PhotosAPI

    init {
        api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(PhotosAPI::class.java)
    }

    fun getPhotos(): Single<List<ContactsContract.CommonDataKinds.Photo>> {
        return api.getPhotos()
    }
}