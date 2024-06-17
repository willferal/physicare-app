package views.physicare.view

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Button
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import views.physicare.ui.theme.primaryBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Perimetria(navController: NavController){
    TopAppBar(
        title = { Text("Perimetria") },
        navigationIcon = {
            IconButton(onClick = {navController.navigate("menuPrincipal")}) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back"
                )
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = primaryBlue,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        )
    )

    Box(){
        Button(onClick = { navController.navigate("cadastroPerimetria")})
        {

       }
   }
}