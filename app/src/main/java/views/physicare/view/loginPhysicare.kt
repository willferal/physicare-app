package views.physicare.view

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.R
import androidx.navigation.NavController
import views.physicare.components.CaixaTexto
import views.physicare.ui.theme.primaryBlue
import views.physicare.ui.theme.secondaryBlue

@Composable
fun TelaLogin(
    navController: NavController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(listOf(primaryBlue, secondaryBlue),)
            )
        )
    {
        Image(
            painter = painterResource(id = views.physicare.R.drawable.logo_no_background),
            contentDescription = null,
            Modifier.align(Alignment.Center)
        );
        CaixaTexto(
            value = "will",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            label = "description",
        )
    }
    
}