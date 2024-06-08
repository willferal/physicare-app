package views.physicare.view

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Perimetria(navController: NavController){
    Box(){
        Button(onClick = { navController.navigate("cadastroPerimetria") }) {
        }
    }
}