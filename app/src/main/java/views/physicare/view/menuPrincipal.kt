package views.physicare.view
import android.annotation.SuppressLint
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
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch
import org.intellij.lang.annotations.JdkConstants
import views.physicare.components.TopBarComponent

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MenuPrincipal(
    navController: NavController
){
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
//                title = { Text(text = "Physicare")},
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
//
//        drawerContent = {
//            IconButton(onClick = {
//                scope.launch {
//                    navController.navigate("chatView")
//                }
//
//            }) {
//                Icon(
//                    Icons.Default.Home,
//                    contentDescription = "Home",
//                    modifier = Modifier
//                        .size(50.dp),
//                )
//
//            }
//
//            IconButton(onClick = {
//                scope.launch {
//                    navController.navigate("chatView")
//                }
//
//            }) {
//                Icon(
//                    Icons.Default.Send,
//                    contentDescription = "Messages",
//                    modifier = Modifier
//                        .size(50.dp),
//                )
//
//            }
//        }
//    ) {
//
//    }
    TopBarComponent(navController = navController)
}