//package views.physicare.view
//
//import android.annotation.SuppressLint
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import views.physicare.ui.theme.primaryBlue
//import views.physicare.ui.theme.secondaryBlue

//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun TelaCadastroPerimetria(navController: NavController) {
//    var patientName by remember { mutableStateOf(TextFieldValue()) }
//    var armCircumference by remember { mutableStateOf(TextFieldValue()) }
//    var waistCircumference by remember { mutableStateOf(TextFieldValue()) }
//    var hipCircumference by remember { mutableStateOf(TextFieldValue()) }
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("Cadastro de Perimetria") },
//                backgroundColor = primaryBlue,
//                contentColor = Color.White
//            )
//        }
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(
//                    Brush.linearGradient(listOf(Color.White, Color(0xFF87CEEB)))
//                )
//                .padding(16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "Dados do Paciente",
//                fontSize = 24.sp,
//                fontWeight = FontWeight.Bold,
//                color = primaryBlue,
//                modifier = Modifier.padding(bottom = 24.dp)
//            )
//
//            CustomTextField(
//                value = patientName,
//                onValueChange = { patientName = it },
//                label = "Nome do Paciente"
//            )
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            CustomTextField(
//                value = armCircumference,
//                onValueChange = { armCircumference = it },
//                label = "Circunferência do Braço (cm)"
//            )
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            CustomTextField(
//                value = waistCircumference,
//                onValueChange = { waistCircumference = it },
//                label = "Circunferência da Cintura (cm)"
//            )
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            CustomTextField(
//                value = hipCircumference,
//                onValueChange = { hipCircumference = it },
//                label = "Circunferência do Quadril (cm)"
//            )
//
//            Spacer(modifier = Modifier.height(24.dp))
//
//            Button(
//                onClick = { /* Ação de salvar */ },
//                colors = ButtonDefaults.buttonColors(containerColor = primaryBlue),
//                shape = RoundedCornerShape(8.dp),
//                modifier = Modifier.fillMaxWidth().height(50.dp)
//            ) {
//                Text("Salvar", color = Color.White, fontSize = 18.sp)
//            }
//        }
//    }
//}
//
//@Composable
//fun CustomTextField(value: TextFieldValue, onValueChange: (TextFieldValue) -> Unit, label: String) {
//    BasicTextField(
//        value = value,
//        onValueChange = onValueChange,
//        decorationBox = { innerTextField ->
//            Box(
//                modifier = Modifier
//                    .background(Color.White)
//                    .fillMaxWidth()
//                    .padding(8.dp)
//            ) {
//                if (value.text.isEmpty()) {
//                    Text(text = label, color = Color.Gray)
//                }
//                innerTextField()
//            }
//        },
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.White)
//            .padding(8.dp)
//    )
//}


package views.physicare.view

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TelaCadastroPerimetria(navController: NavController) {
    var patientName by remember { mutableStateOf(TextFieldValue()) }
    var armRCircumference by remember { mutableStateOf(TextFieldValue()) }
    var armECircumference by remember { mutableStateOf(TextFieldValue()) }
    var forearmRCircumference by remember { mutableStateOf(TextFieldValue()) }
    var forearmECircumference by remember { mutableStateOf(TextFieldValue()) }
    var absCircumference by remember { mutableStateOf(TextFieldValue()) }
    var hipCircumference by remember { mutableStateOf(TextFieldValue()) }
    var quadsRCircumference by remember { mutableStateOf(TextFieldValue()) }
    var quadsECircumference by remember { mutableStateOf(TextFieldValue()) }
    var calfRCircumference by remember { mutableStateOf(TextFieldValue()) }
    var calfECircumference by remember { mutableStateOf(TextFieldValue()) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Cadastro de Perimetria") },
                navigationIcon = {
                    IconButton(onClick = {navController.navigate("perimetria")}) {
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
        }
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
                value = armRCircumference,
                onValueChange = { armRCircumference = it },
                label = "Circunferência do Braço direito (cm)"
            )

            Spacer(modifier = Modifier.height(16.dp))

            CustomTextField(
                value = armECircumference,
                onValueChange = { armECircumference = it },
                label = "Circunferência do Braço esquerdo (cm)"
            )

            Spacer(modifier = Modifier.height(16.dp))

            CustomTextField(
                value = forearmRCircumference,
                onValueChange = { forearmRCircumference = it },
                label = "Circunferência do antebraço direito (cm)"
            )

            Spacer(modifier = Modifier.height(16.dp))

            CustomTextField(
                value = forearmECircumference,
                onValueChange = { forearmECircumference = it },
                label = "Circunferência do antebraço esquerdo (cm)"
            )

            Spacer(modifier = Modifier.height(24.dp))

            CustomTextField(
                value = absCircumference,
                onValueChange = { absCircumference = it },
                label = "Circunferência do abdomen (cm)"
            )

            Spacer(modifier = Modifier.height(24.dp))

            CustomTextField(
                value = hipCircumference,
                onValueChange = { hipCircumference = it },
                label = "Circunferência do quadril (cm)"
            )

            Spacer(modifier = Modifier.height(24.dp))

            CustomTextField(
                value = quadsRCircumference,
                onValueChange = { quadsRCircumference = it },
                label = "Circunferência da coxa direita (cm)"
            )

            Spacer(modifier = Modifier.height(24.dp))

            CustomTextField(
                value = quadsECircumference,
                onValueChange = { quadsECircumference = it },
                label = "Circunferência da coxa esquerda (cm)"
            )

            Spacer(modifier = Modifier.height(24.dp))

            CustomTextField(
                value = calfRCircumference,
                onValueChange = { calfRCircumference = it },
                label = "Circunferência da panturrilha direita (cm)"
            )

            Spacer(modifier = Modifier.height(24.dp))

            CustomTextField(
                value = calfECircumference,
                onValueChange = { calfECircumference = it },
                label = "Circunferência da panturrilha esquerda (cm)"
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
