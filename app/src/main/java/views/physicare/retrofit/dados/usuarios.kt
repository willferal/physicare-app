package views.physicare.retrofit.dados

import com.squareup.moshi.Json

data class DataUser(
    @Json(name = "name")val name: String,
    @Json(name = "email")val email: String
)

