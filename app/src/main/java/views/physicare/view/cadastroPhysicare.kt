package views.physicare.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import views.physicare.R
import views.physicare.components.CaixaTexto
import views.physicare.ui.theme.primaryBlue
import views.physicare.ui.theme.secondaryBlue

@Composable
fun TelaCadastro(
    navController: NavController
){
    var nomeCadastro by remember{
        mutableStateOf("")
    }


    var emailCadastro by remember{
        mutableStateOf("")
    }


    var senhaCadastro by remember{
        mutableStateOf("")
    }


    var confirmarSenhaCadastro by remember{
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
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

        Spacer(modifier = Modifier.size(14.dp))

        CaixaTexto(
            value = nomeCadastro,
            onValueChange = {
                            nomeCadastro = it
            },
            modifier = Modifier,
            label = "nome",
            keyboardType = KeyboardType.Text
        )

        Spacer(modifier = Modifier.size(14.dp))

        CaixaTexto(
            value = "email",
            onValueChange = {},
            modifier = Modifier,
            label = "email",
            keyboardType = KeyboardType.Text
        )

        Spacer(modifier = Modifier.size(14.dp))

        CaixaTexto(
            value = "telefone",
            onValueChange = {},
            modifier = Modifier,
            label = "telefone",
            keyboardType = KeyboardType.Text
        )

        Spacer(modifier = Modifier.size(14.dp))

        CaixaTexto(
            value = "Senha",
            onValueChange = {},
            modifier = Modifier,
            label = "Senha",
            keyboardType = KeyboardType.Text
        )

        Spacer(modifier = Modifier.size(14.dp))

        CaixaTexto(
            value = "Confirmacao de senha",
            onValueChange = {},
            modifier = Modifier,
            label = "Confirmacao de senha",
            keyboardType = KeyboardType.Text
        )

        Spacer(modifier = Modifier.size(14.dp))

        Row(
            verticalAlignment = Alignment.Bottom,
        ){
            Button(onClick = {
                navController.navigate("telaDeLogin")
            }
            ){
                Text(text = "Voltar")
            }

            Spacer(modifier = Modifier.size(14.dp))

            Button(onClick = {
                navController.navigate("")
            }
            ){
                Text(text = "Enviar")
            }
    }

//    Row(
//        verticalAlignment = Alignment.Bottom,
//    ){
//        Button(onClick = {
//            navController.navigate("telaDeCadastro")
//        }
//        ){
//            Text(text = "Cancelar")
//        }
//
//
//
//        Button(onClick = {
//            navController.navigate("telaDeCadastro")
//        }
//        ){
//            Text(text = "Enviar")
//        }
    }
}