package com.prakmobile.ronisetiawan175410118.api

import android.provider.ContactsContract
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosAPI {
    @GET("photos")
    fun getPhotos() : Single<List<ContactsContract.CommonDataKinds.Photo>>
}