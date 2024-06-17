//package views.physicare.view
//import android.service.autofill.UserData
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//
//
//import views.physicare.retrofit.RetrofitInstance
//import views.physicare.retrofit.dados.DataUser
//
//
//private fun fetchData() {
//    val call = RetrofitInstance.api.findAddresses()
//
//    call.enqueue(object : Callback<DataUser> {
//        override fun onResponse(call: Call<DataUser>, response: Response<DataUser>) {
//            if(response.isSuccessful){
//                val responseData = response.body()
//                responseData.let {
//                }
//            }
//        }
//        override fun onFailure(call: Call<DataUser>, t: Throwable) {
//            TODO("Not yet implemented")
//        }
//    })
//}