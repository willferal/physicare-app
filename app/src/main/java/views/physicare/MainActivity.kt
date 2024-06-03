package views.physicare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import views.physicare.ui.theme.PhysicareTheme
import views.physicare.view.AgendamentoView
import views.physicare.view.ChatView
import views.physicare.view.MenuPrincipal
import views.physicare.view.TelaCadastro
import views.physicare.view.TelaLogin
import views.physicare.view.ChatView
import views.physicare.view.MinhaFichaView

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhysicareTheme {
                val navController = rememberNavController()
                
                NavHost(navController = navController, startDestination = "telaDeLogin"){
                    composable(
                        route = "telaDeLogin"
                    ){
                        TelaLogin(navController)
                    }

                    composable(
                        route = "telaDeCadastro"
                    ){
                        TelaCadastro(navController)
                    }

                    composable(
                        route = "menuPrincipal"
                    ){
                        MenuPrincipal(navController)
                    }

                    composable(
                        route = "chatView"
                    ){
                        ChatView(navController)
                    }

                    composable(
                        route = "agendamento"
                    ){
                        AgendamentoView(navController)
                    }

                    composable(
                        route = "minhaFicha"
                    ){
                        MinhaFichaView(navController)
                    }
                }
            }
        }
    }
}


