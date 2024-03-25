package views.physicare.view

import android.media.Image
import android.widget.LinearLayout
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import views.physicare.components.CaixaTexto
import views.physicare.ui.theme.primaryBlue
import views.physicare.ui.theme.secondaryBlue

@ExperimentalFoundationApi
@Composable
fun TelaLogin(
    navController: NavController
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(listOf(primaryBlue, secondaryBlue),)
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        )
    {
        Image(
            painter = painterResource(id = views.physicare.R.drawable.logo_no_background),
            contentDescription = null,
            Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.size(70.dp))

        CaixaTexto(
            value = "Usuario ou email",
            onValueChange = {},
            modifier = Modifier,
            label = "Usuario",
        )

        Spacer(modifier = Modifier.size(14.dp))

        CaixaTexto(
            value = "Senha",
            onValueChange = {},
            modifier = Modifier,
            label = "Senha",
        )

        Spacer(modifier = Modifier.size(14.dp))
        
        Button(onClick = { 
            navController.navigate("telaDeCadastro")
        }
        ){
            Text(text = "Entrar")
        }
        
        Spacer(modifier = Modifier.size(10.dp))

//        Text(
//            text = "Nao tem uma conta? Cadastre-se aqui!",
//            style = TextStyle(
//                fontSize = 12.sp,
//                fontWeight = FontWeight.Bold
//            ),
//          onClick = {
//              navController.navigate("telaDeCadastro")
//          }
//        )

        ClickableText(
            text = AnnotatedString("\"Nao tem uma conta? Cadastre-se aqui!\""),
            onClick = {
                navController.navigate("telaDeCadastro")
            },
            onHover = {

            },
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
    
}