package views.physicare.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "http://192.168.56.69:8080"

    val client = OkHttpClient.Builder().
    addInterceptor(HttpLoggingInterceptor().apply{
        level = HttpLoggingInterceptor.Level.BODY
    }).build()

    val api: PhysicareService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(client)
            .build()
            .create(PhysicareService::class.java)
    }
}