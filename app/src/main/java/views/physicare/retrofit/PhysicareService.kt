package views.physicare.retrofit

import retrofit2.Call
import retrofit2.http.GET
import views.physicare.retrofit.dados.DataUser

public interface PhysicareService {
    @GET("/client-users")
    fun findAddresses(): Call<DataUser>
}