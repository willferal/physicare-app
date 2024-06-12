//package views.physicare.components
//
//import android.annotation.SuppressLint
//import android.widget.Space
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.size
//import androidx.compose.material.Button
//import androidx.compose.material.ButtonDefaults
//import androidx.compose.material.Divider
//import androidx.compose.material.DrawerValue
//import androidx.compose.material.Icon
//import androidx.compose.material.IconButton
//import androidx.compose.material.Scaffold
//import androidx.compose.material.Text
//import androidx.compose.material.TopAppBar
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.AccountBox
//import androidx.compose.material.icons.filled.DateRange
//import androidx.compose.material.icons.filled.Email
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.List
//import androidx.compose.material.icons.filled.Menu
//import androidx.compose.material.icons.filled.Send
//import androidx.compose.material.rememberDrawerState
//import androidx.compose.material.rememberScaffoldState
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//import kotlinx.coroutines.launch
//import views.physicare.ui.theme.secondaryBlue
//
//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Composable
//fun TopBarComponent(
//    navController: NavController
//){
//    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
//    val scope = rememberCoroutineScope()
//
//    Scaffold(
//        scaffoldState = scaffoldState,
//        topBar = {
//            TopAppBar(
//                backgroundColor = secondaryBlue,
//                contentColor = Color.Black,
//                elevation = 0.dp,
//                title = { Text(text = "Physicare") },
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .size(50.dp),
//
//                navigationIcon = {
//                    IconButton(onClick = {
//                        scope.launch {
//                            scaffoldState.drawerState.open()
//                        }
//                    }) {
//                        Icon(
//                            Icons.Default.Menu, contentDescription = "Menu",
//                            modifier = Modifier.size(35.dp)
//                        )
//
//                    }
//                }
//            )
//        },
//        drawerContent = {
//            Column {
//                Text(text = "Wilson")
//
//                Button(onClick = {
//                    navController.navigate("menuPrincipal")
//                },
//                    colors = ButtonDefaults.buttonColors(
//                        backgroundColor = Color.Transparent,
//                        contentColor = Color.Black
//                    ),
//                    modifier = Modifier.fillMaxWidth()
//                ){
//                    Icon(
//                        Icons.Default.Home,
//                        contentDescription = "Home",
//                        modifier = Modifier.size(50.dp),
//                    )
//                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
//                    Text(text = "Tela Principal")
//                }
//
//
//                Button(onClick = {
//                    navController.navigate("chatView")
//                },
//                    colors = ButtonDefaults.buttonColors(
//                        backgroundColor = Color.Transparent,
//                        contentColor = Color.Black
//                    ),
//                    modifier = Modifier.fillMaxWidth()
//                ){
//                    Icon(
//                        Icons.Default.Email,
//                        contentDescription = "Menssagens",
//                        modifier = Modifier.size(50.dp),
//                    )
//                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
//                    Text(text = "Mensagens")
//                }
//
//
//                Button(onClick = {
//                    navController.navigate("agendamento")
//                },
//                    colors = ButtonDefaults.buttonColors(
//                        backgroundColor = Color.Transparent,
//                        contentColor = Color.Black
//                    ),
//                    modifier = Modifier.fillMaxWidth()
//                ){
//                    Icon(
//                        Icons.Default.DateRange ,
//                        contentDescription = "agendamento",
//                        modifier = Modifier.size(50.dp),
//                    )
//                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
//                    Text(text = "Agendamentos")
//                }
//
//                Button(onClick = {
//                    navController.navigate("minhaFicha")
//                },
//                    colors = ButtonDefaults.buttonColors(
//                        backgroundColor = Color.Transparent,
//                        contentColor = Color.Black
//                    ),
//                    modifier = Modifier.fillMaxWidth()
//                ){
//                    Icon(
//                        Icons.Default.List ,
//                        contentDescription = "Ficha de treino",
//                        modifier = Modifier.size(50.dp),
//                    )
//                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
//                    Text(text = "Ficha de treino")
//                }
//
//                Button(onClick = {
//                    navController.navigate("perimetria")
//                },
//                    colors = ButtonDefaults.buttonColors(
//                        backgroundColor = Color.Transparent,
//                        contentColor = Color.Black
//                    ),
//                    modifier = Modifier.fillMaxWidth()
//                ){
//                    Icon(
//                        Icons.Default.AccountBox,
//                        contentDescription = "perimetria",
//                        modifier = Modifier.size(50.dp),
//                    )
//                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
//                    Text(text = "Perimetria")
//                }
//            }
//        }
//    ) {
//
//    }
//}


//package views.physicare.components
//
//import android.annotation.SuppressLint
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.*
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//import kotlinx.coroutines.launch
//import views.physicare.ui.theme.primaryBlue
//import views.physicare.ui.theme.secondaryBlue
//
//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Composable
//fun TopBarComponent(
//    navController: NavController
//) {
//    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
//    val scope = rememberCoroutineScope()
//
//    Scaffold(
//        scaffoldState = scaffoldState,
//        topBar = {
//            TopAppBar(
//                backgroundColor = primaryBlue,
//                contentColor = Color.White,
//                elevation = 4.dp,
//                title = {
//                    Text(text = "Physicare", style = MaterialTheme.typography.h6)
//                },
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(56.dp),
//                navigationIcon = {
//                    IconButton(onClick = {
//                        scope.launch {
//                            scaffoldState.drawerState.open()
//                        }
//                    }) {
//                        Icon(
//                            Icons.Default.Menu, contentDescription = "Menu",
//                            modifier = Modifier.size(28.dp)
//                        )
//                    }
//                }
//            )
//        },
//        drawerContent = {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.White)
//            ) {
//                DrawerButton(navController, "menuPrincipal", Icons.Default.Home, "Tela Principal")
//                DrawerButton(navController, "chatView", Icons.Default.Email, "Mensagens")
//                DrawerButton(navController, "agendamento", Icons.Default.DateRange, "Agendamentos")
//                DrawerButton(navController, "minhaFicha", Icons.Default.List, "Minha Ficha")
//            }
//        },
//        content = { paddingValues ->
//            Box(modifier = Modifier.padding(paddingValues)) {
//
//            }
//        }
//    )
//}
//
//@Composable
//fun DrawerButton(navController: NavController, route: String, icon: ImageVector, text: String) {
//    Button(
//        onClick = { navController.navigate(route) },
//        colors = ButtonDefaults.buttonColors(
//            backgroundColor = Color.Transparent,
//            contentColor = primaryBlue
//        ),
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 4.dp, horizontal = 16.dp),
//        shape = RoundedCornerShape(8.dp),
//        elevation = ButtonDefaults.elevation(0.dp, 0.dp)
//    ) {
//        Icon(
//            icon,
//            contentDescription = text,
//            modifier = Modifier.size(24.dp)
//        )
//        Spacer(Modifier.size(16.dp))
//        Text(text)
//    }
//}


//package views.physicare.components
//
//import android.annotation.SuppressLint
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.*
//import androidx.compose.material3.ModalNavigationDrawer
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//import kotlinx.coroutines.launch
//import views.physicare.ui.theme.primaryBlue
//
//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Composable
//fun TopBarComponent(
//    navController: NavController
//) {
//    val drawerState = DrawerState(DrawerValue.Closed)
//    val scope = rememberCoroutineScope()
//
//    ModalNavigationDrawer(
//        drawerContent = {
//            DrawerContent(navController)
//        },
//        drawerState = androidx.compose.material3.DrawerState(androidx.compose.material3.DrawerValue.Closed),
//        content = {
//            Scaffold(
//                topBar = {
//                    TopAppBar(
//                        backgroundColor = primaryBlue,
//                        contentColor = Color.White,
//                        elevation = 4.dp,
//                        title = {
//                            Text(text = "Physicare", style = MaterialTheme.typography.h6)
//                        },
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(56.dp),
//                        navigationIcon = {
//                            IconButton(onClick = {
//                                scope.launch {
//                                    drawerState.open()
//                                }
//                            }) {
//                                Icon(
//                                    Icons.Default.Menu, contentDescription = "Menu",
//                                    modifier = Modifier.size(28.dp)
//                                )
//                            }
//                        }
//                    )
//                },
//                content = { paddingValues ->
//                    Box(modifier = Modifier.padding(paddingValues)) {
//                        // Conteúdo da tela principal
//                    }
//                }
//            )
//        }
//    )
//}
//
//@Composable
//fun DrawerContent(navController: NavController) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//    ) {
//        DrawerButton(navController, "menuPrincipal", Icons.Default.Home, "Tela Principal")
//        DrawerButton(navController, "chatView", Icons.Default.Email, "Mensagens")
//        DrawerButton(navController, "agendamento", Icons.Default.DateRange, "Agendamentos")
//        DrawerButton(navController, "minhaFicha", Icons.Default.List, "Minha Ficha")
//        DrawerButton(navController, "perimetria", Icons.Default.AccountBox, "Perimetria")
//    }
//}
//
//@Composable
//fun DrawerButton(navController: NavController, route: String, icon: ImageVector, text: String) {
//    Button(
//        onClick = { navController.navigate(route) },
//        colors = ButtonDefaults.buttonColors(
//            backgroundColor = Color.Transparent,
//            contentColor = primaryBlue
//        ),
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 4.dp, horizontal = 16.dp),
//        shape = RoundedCornerShape(8.dp),
//        elevation = ButtonDefaults.elevation(0.dp, 0.dp)
//    ) {
//        Icon(
//            icon,
//            contentDescription = text,
//            modifier = Modifier.size(24.dp)
//        )
//        Spacer(Modifier.size(16.dp))
//        Text(text)
//    }
//}


package views.physicare.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.launch
import views.physicare.ui.theme.primaryBlue
import views.physicare.ui.theme.secondaryBlue

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TopBarComponent(
    navController: NavController,
    //userName: String
) {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
                TopAppBar(
                    backgroundColor = primaryBlue,
                    contentColor = Color.White,
                    elevation = 4.dp,
                    title = { Text(text = "Physicare", style = MaterialTheme.typography.h5) },
                    modifier = Modifier.fillMaxWidth(),
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch { scaffoldState.drawerState.open() }
                        }) {
                            Icon(
                                Icons.Default.Menu,
                                contentDescription = "Menu",
                                modifier = Modifier.size(32.dp)
                            )
                        }
                    }
                )
            },
        drawerContent = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                DrawerButton(navController, "menuPrincipal", Icons.Default.Home, "Tela Principal")
                DrawerButton(navController, "chatView", Icons.Default.Email, "Mensagens")
                DrawerButton(navController, "minhaFicha", Icons.Default.List, "Minha Ficha")
                DrawerButton(navController, "perimetria", Icons.Default.AccountBox, "Perimetria")
            }
        },
        content = { paddingValues ->
                SearchBar()
        }
    )
}

@Composable
fun DrawerButton(navController: NavController, route: String, icon: ImageVector, text: String) {
    Button(
        onClick = { navController.navigate(route) },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = primaryBlue
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = ButtonDefaults.elevation(0.dp, 0.dp)
    ) {
        Icon(
            icon,
            contentDescription = text,
            modifier = Modifier.size(28.dp)
        )
        Spacer(Modifier.size(20.dp))
        Text(text, fontSize = 18.sp)
    }
}
