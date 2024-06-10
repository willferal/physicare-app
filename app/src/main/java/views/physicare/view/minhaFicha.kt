package views.physicare.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import views.physicare.components.TopBarComponent
import views.physicare.ui.theme.primaryBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MinhaFichaView(
    navController: NavController
) {
    TopAppBar(
        title = { androidx.compose.material3.Text("Minha Ficha") },
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

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Minha ficha view")
    }
}