package views.physicare.components

import android.annotation.SuppressLint
import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.DrawerValue
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch
import views.physicare.ui.theme.secondaryBlue

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TopBarComponent(
    navController: NavController
){
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                backgroundColor = secondaryBlue,
                contentColor = Color.Black,
                elevation = 0.dp,
                title = { Text(text = "Physicare") },
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp),

                navigationIcon = {
                    IconButton(onClick = {
                        scope.launch {
                            scaffoldState.drawerState.open()
                        }
                    }) {
                        Icon(
                            Icons.Default.Menu, contentDescription = "Menu",
                            modifier = Modifier.size(35.dp)
                        )

                    }
                }
            )
        },
        drawerContent = {
            Column {
                Button(onClick = {
                    navController.navigate("menuPrincipal")
                },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent,
                        contentColor = Color.Black
                    ),
                    modifier = Modifier.fillMaxWidth()
                ){
                    Icon(
                        Icons.Default.Home,
                        contentDescription = "Home",
                        modifier = Modifier.size(50.dp),
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text(text = "Tela Principal")
                }


                Button(onClick = {
                    navController.navigate("chatView")
                },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent,
                        contentColor = Color.Black
                    ),
                    modifier = Modifier.fillMaxWidth()
                ){
                    Icon(
                        Icons.Default.Email,
                        contentDescription = "Menssagens",
                        modifier = Modifier.size(50.dp),
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text(text = "Mensagens")
                }


                Button(onClick = {
                    navController.navigate("agendamento")
                },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent,
                        contentColor = Color.Black
                    ),
                    modifier = Modifier.fillMaxWidth()
                ){
                    Icon(
                        Icons.Default.DateRange ,
                        contentDescription = "agendamento",
                        modifier = Modifier.size(50.dp),
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text(text = "Agendamentos")
                }

                Button(onClick = {
                    navController.navigate("minhaFicha")
                },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent,
                        contentColor = Color.Black
                    ),
                    modifier = Modifier.fillMaxWidth()
                ){
                    Icon(
                        Icons.Default.List ,
                        contentDescription = "Ficha de treino",
                        modifier = Modifier.size(50.dp),
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text(text = "Minha Ficha")
                }
            }
        }
    ) {

    }
}