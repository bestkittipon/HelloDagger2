package com.example.thebest.hellodagger2.util

import com.example.thebest.hellodagger2.model.Post
import io.reactivex.Observable
import retrofit2.http.GET


interface ApiService {
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}
