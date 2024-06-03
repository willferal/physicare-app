package views.physicare.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.navigation.NavController
import views.physicare.components.TopBarComponent
import views.physicare.ui.theme.primaryBlue
import views.physicare.ui.theme.secondaryBlue



@Composable
fun ChatView(
    navController: NavController
) {
    TopBarComponent(navController = navController)
    
    Column(
        modifier = Modifier
           .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Chat View")
    }
}