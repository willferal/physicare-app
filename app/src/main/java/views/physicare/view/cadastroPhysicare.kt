//package views.physicare.view
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//import views.physicare.R
//import views.physicare.components.CaixaTexto
//import views.physicare.ui.theme.primaryBlue
//import views.physicare.ui.theme.secondaryBlue
//
//@Composable
//fun TelaCadastro(
//    navController: NavController
//){
//    var nomeCadastro by remember{
//        mutableStateOf("")
//    }
//
//
//    var emailCadastro by remember{
//        mutableStateOf("")
//    }
//
//
//    var telefoneCadastro by remember{
//        mutableStateOf("")
//    }
//
//
//    var senhaCadastro by remember{
//        mutableStateOf("")
//    }
//
//
//    var confirmarSenhaCadastro by remember{
//        mutableStateOf("")
//    }
//
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .verticalScroll(rememberScrollState())
//            .background(
//                Brush.linearGradient(listOf(primaryBlue, secondaryBlue),)
//            ),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        Image(
//            painter = painterResource(id = R.drawable.logo_no_background),
//            contentDescription = null,
//            Modifier.align(Alignment.CenterHorizontally)
//        )
//
//        Spacer(modifier = Modifier.size(14.dp))
//
//        CaixaTexto(
//            value = nomeCadastro,
//            onValueChange = {
//                            nomeCadastro = it
//            },
//            modifier = Modifier,
//            label = "nome",
//            keyboardType = KeyboardType.Text
//        )
//
//        Spacer(modifier = Modifier.size(14.dp))
//
//        CaixaTexto(
//            value = emailCadastro,
//            onValueChange = {
//                            emailCadastro = it
//            },
//            modifier = Modifier,
//            label = "email",
//            keyboardType = KeyboardType.Text
//        )
//
//        Spacer(modifier = Modifier.size(14.dp))
//
//        CaixaTexto(
//            value = telefoneCadastro,
//            onValueChange = {
//                            telefoneCadastro = it
//            },
//            modifier = Modifier,
//            label = "telefone",
//            keyboardType = KeyboardType.Text
//        )
//
//        Spacer(modifier = Modifier.size(14.dp))
//
//        CaixaTexto(
//            value = senhaCadastro,
//            onValueChange = {
//                            senhaCadastro = it
//            },
//            modifier = Modifier,
//            label = "Senha",
//            keyboardType = KeyboardType.Text
//        )
//
//        Spacer(modifier = Modifier.size(14.dp))
//
//        CaixaTexto(
//            value = confirmarSenhaCadastro,
//            onValueChange = {
//                            confirmarSenhaCadastro = it
//            },
//            modifier = Modifier,
//            label = "Confirmacao de senha",
//            keyboardType = KeyboardType.Text
//        )
//
//        Spacer(modifier = Modifier.size(14.dp))
//
//        Row(
//            verticalAlignment = Alignment.Bottom,
//        ){
//            Button(onClick = {
//                navController.navigate("telaDeLogin")
//            }
//            ){
//                Text(text = "Voltar")
//            }
//
//            Spacer(modifier = Modifier.size(14.dp))
//
//            Button(onClick = {
//                navController.navigate("")
//            }
//            ){
//                Text(text = "Enviar")
//            }
//    }
//
////    Row(
////        verticalAlignment = Alignment.Bottom,
////    ){
////        Button(onClick = {
////            navController.navigate("telaDeCadastro")
////        }
////        ){
////            Text(text = "Cancelar")
////        }
////
////
////
////        Button(onClick = {
////            navController.navigate("telaDeCadastro")
////        }
////        ){
////            Text(text = "Enviar")
////        }
//    }
//}


package views.physicare.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import views.physicare.R
import views.physicare.ui.theme.primaryBlue
import views.physicare.ui.theme.secondaryBlue

@Composable
fun TelaCadastro(navController: NavController) {
    var nomeCadastro by remember { mutableStateOf(TextFieldValue()) }
    var emailCadastro by remember { mutableStateOf(TextFieldValue()) }
    var telefoneCadastro by remember { mutableStateOf(TextFieldValue()) }
    var senhaCadastro by remember { mutableStateOf(TextFieldValue()) }
    var confirmarSenhaCadastro by remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(
                Brush.linearGradient(listOf(Color.White, Color(0xFF87CEEB)))
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_no_background),
            contentDescription = null,
            Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.size(14.dp))

        CustomTextField(
            value = nomeCadastro,
            onValueChange = { nomeCadastro =  it},
            label = "Nome",
            //keyboardType = KeyboardType.Text
        )

        Spacer(modifier = Modifier.size(14.dp))

        CustomTextField(
            value = emailCadastro,
            onValueChange = { emailCadastro = it },
            label = "Email",
            //keyboardType = KeyboardType.Text
        )

        Spacer(modifier = Modifier.size(14.dp))

        CustomTextField(
            value = telefoneCadastro,
            onValueChange = { telefoneCadastro = it },
            label = "Telefone",
            //keyboardType = KeyboardType.Phone
        )

        Spacer(modifier = Modifier.size(14.dp))

        CustomTextField(
            value = senhaCadastro,
            onValueChange = { senhaCadastro = it },
            label = "Senha",
            //keyboardType = KeyboardType.Password
        )

        Spacer(modifier = Modifier.size(14.dp))

        CustomTextField(
            value = confirmarSenhaCadastro,
            onValueChange = { confirmarSenhaCadastro = it },
            label = "Confirmação de senha",
            //keyboardType = KeyboardType.Password
        )

        Spacer(modifier = Modifier.size(24.dp))

        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Button(
                onClick = { navController.navigate("telaDeLogin") },
                colors = ButtonDefaults.buttonColors(containerColor = primaryBlue),
                modifier = Modifier.weight(1f).height(50.dp)
            ) {
                Text(text = "Voltar", color = Color.White, fontSize = 18.sp)
            }

            Button(
                onClick = { navController.navigate("") },
                colors = ButtonDefaults.buttonColors(containerColor = primaryBlue),
                modifier = Modifier.weight(1f).height(50.dp)
            ) {
                Text(text = "Enviar", color = Color.White, fontSize = 18.sp)
            }
        }
    }
}


