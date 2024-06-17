package views.physicare.components

import android.service.autofill.UserData
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import views.physicare.retrofit.RetrofitInstance
import views.physicare.retrofit.dados.DataUser

@Composable
fun CardComponent(){
    Card(
        backgroundColor = Color(0xFFDED4D4),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        ConstraintLayout (
            modifier = Modifier.padding(6.dp)
        ){
            val (nomeContato, descricaoContato) = createRefs()

            Text(text = "Contato 1",
                modifier = Modifier.constrainAs(nomeContato) {
                    start.linkTo(parent.start)
                }
            )
        }
    }
}

//private fun fetchData() {
//    val call = RetrofitInstance.api.findAddresses()
//
//    call.enqueue(object : Callback<DataUser> {
//        override fun onResponse(call: Call<DataUser>, response: Response<DataUser>) {
//            if (response.isSuccessful) {
//                val responseData = response.body()
//                responseData?.let {
//
//                }
//            } else {
//                println("Request failed with code: ${response.code()}")
//            }
//        }
//
//        override fun onFailure(call: Call<DataUser>, t: Throwable) {
//            t.printStackTrace()
//        }
//    })
//}
//}