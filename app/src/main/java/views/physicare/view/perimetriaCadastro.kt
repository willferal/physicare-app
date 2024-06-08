//import android.annotation.SuppressLint
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.NavController
//
//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Composable
//fun PerimetriaScreen(navController: NavController) {
//    val lightBlue = Color(0xFF87CEEB)
//    var patientName by remember { mutableStateOf("") }
//    var armCircumference by remember { mutableStateOf("") }
//    var waistCircumference by remember { mutableStateOf("") }
//    var hipCircumference by remember { mutableStateOf("") }
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("Cadastro de Perimetria") },
//                backgroundColor = lightBlue,
//                contentColor = Color.White
//            )
//        }
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(Color.White)
//                .padding(16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "Dados do Paciente",
//                fontSize = 24.sp,
//                fontWeight = FontWeight.Bold,
//                color = lightBlue,
//                modifier = Modifier.padding(bottom = 24.dp)
//            )
//
//            TextField(
//                value = patientName,
//                onValueChange = { patientName = it },
//                label = { Text("Nome do Paciente") },
//                modifier = Modifier.fillMaxWidth(),
//                colors = TextFieldDefaults.textFieldColors(
//                    backgroundColor = Color.White,
//                    focusedIndicatorColor = lightBlue,
//                    cursorColor = lightBlue
//                )
//            )
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            TextField(
//                value = armCircumference,
//                onValueChange = { armCircumference = it },
//                label = { Text("Circunferência do Braço (cm)") },
//                modifier = Modifier.fillMaxWidth(),
//                colors = TextFieldDefaults.textFieldColors(
//                    backgroundColor = Color.White,
//                    focusedIndicatorColor = lightBlue,
//                    cursorColor = lightBlue
//                )
//            )
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            TextField(
//                value = waistCircumference,
//                onValueChange = { waistCircumference = it },
//                label = { Text("Circunferência da Cintura (cm)") },
//                modifier = Modifier.fillMaxWidth(),
//                colors = TextFieldDefaults.textFieldColors(
//                    backgroundColor = Color.White,
//                    focusedIndicatorColor = lightBlue,
//                    cursorColor = lightBlue
//                )
//            )
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            TextField(
//                value = hipCircumference,
//                onValueChange = { hipCircumference = it },
//                label = { Text("Circunferência do Quadril (cm)") },
//                modifier = Modifier.fillMaxWidth(),
//                colors = TextFieldDefaults.textFieldColors(
//                    backgroundColor = Color.White,
//                    focusedIndicatorColor = lightBlue,
//                    cursorColor = lightBlue
//                )
//            )
//
//            Spacer(modifier = Modifier.height(24.dp))
//
//            Button(
//                onClick = { /* Ação de salvar */ },
//                colors = ButtonDefaults.buttonColors(backgroundColor = lightBlue),
//                shape = RoundedCornerShape(8.dp),
//                modifier = Modifier.fillMaxWidth().height(50.dp)
//            ) {
//                Text("Salvar", color = Color.White, fontSize = 18.sp)
//            }
//        }
//    }
//}


package views.physicare.view

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import views.physicare.ui.theme.primaryBlue
import views.physicare.ui.theme.secondaryBlue

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaCadastroPerimetria(navController: NavController) {
    var patientName by remember { mutableStateOf(TextFieldValue()) }
    var armCircumference by remember { mutableStateOf(TextFieldValue()) }
    var waistCircumference by remember { mutableStateOf(TextFieldValue()) }
    var hipCircumference by remember { mutableStateOf(TextFieldValue()) }

    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("Cadastro de Perimetria") },
//                backgroundColor = primaryBlue,
//                contentColor = Color.White
//            )
//        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.linearGradient(listOf(Color.White, Color(0xFF87CEEB)))
                )
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Dados do Paciente",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = primaryBlue,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            CustomTextField(
                value = patientName,
                onValueChange = { patientName = it },
                label = "Nome do Paciente"
            )

            Spacer(modifier = Modifier.height(16.dp))

            CustomTextField(
                value = armCircumference,
                onValueChange = { armCircumference = it },
                label = "Circunferência do Braço (cm)"
            )

            Spacer(modifier = Modifier.height(16.dp))

            CustomTextField(
                value = waistCircumference,
                onValueChange = { waistCircumference = it },
                label = "Circunferência da Cintura (cm)"
            )

            Spacer(modifier = Modifier.height(16.dp))

            CustomTextField(
                value = hipCircumference,
                onValueChange = { hipCircumference = it },
                label = "Circunferência do Quadril (cm)"
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { /* Ação de salvar */ },
                colors = ButtonDefaults.buttonColors(containerColor = primaryBlue),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth().height(50.dp)
            ) {
                Text("Salvar", color = Color.White, fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun CustomTextField(value: TextFieldValue, onValueChange: (TextFieldValue) -> Unit, label: String) {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        decorationBox = { innerTextField ->
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                if (value.text.isEmpty()) {
                    Text(text = label, color = Color.Gray)
                }
                innerTextField()
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(8.dp)
    )
}
