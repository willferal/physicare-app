package views.physicare.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import views.physicare.R
import views.physicare.ui.theme.primaryBlue
import views.physicare.ui.theme.secondaryBlue

@Composable
fun MenuPrincipal(
    navController: NavController
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(listOf(primaryBlue, secondaryBlue),)
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.logo_no_background),
            contentDescription = null,
            Modifier.align(Alignment.CenterHorizontally)
        )
    }
}