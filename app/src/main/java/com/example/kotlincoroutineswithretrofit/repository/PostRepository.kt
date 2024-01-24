package com.example.kotlincoroutineswithretrofit.repository

import com.example.kotlincoroutineswithretrofit.model.Post
import com.example.kotlincoroutineswithretrofit.network.RetrofitBuilder

class PostRepository {

    suspend fun getPost(): List<Post> = RetrofitBuilder.api.getPost()
}