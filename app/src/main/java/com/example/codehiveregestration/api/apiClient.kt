package com.example.codehiveregestration

object ApiClient {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()    fun <T> buildApiClient(apiInterface: Class<T>): T {
        return retrofit.create(apiInterface)
        }
}