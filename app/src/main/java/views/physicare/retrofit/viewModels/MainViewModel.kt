//package views.physicare.retrofit.viewModels
//
//import android.widget.Toast
//import androidx.compose.runtime.mutableStateOf
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import views.physicare.retrofit.dados.DadosCep
//import kotlinx.coroutines.launch
//import views.physicare.retrofit.RetrofitInstance
//
//class MainViewModel: ViewModel() {
//    private val _dados = mutableStateOf<List<DadosCep>>(emptyList())
//    val dados = _dados
//
//    init {
//        fetchDados()
//    }
//
//    private fun fetchDados() {
//        viewModelScope.launch {
//            try {
//                val response = RetrofitInstance.api.findAddresses("60360332")
//                _dados.value = response
//            } catch (e: Exception) {
//
//            }
//        }
//    }
//}