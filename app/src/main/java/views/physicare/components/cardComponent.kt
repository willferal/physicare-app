package views.physicare.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun CardComponent(){
    Card(
        backgroundColor = Color(0xFFDED4D4),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        ConstraintLayout (
            modifier = Modifier.padding(6.dp)
        ){
            val (nomeContato, descricaoContato) = createRefs()

            Text(text = "Contato 1",
                modifier = Modifier.constrainAs(nomeContato) {
                    start.linkTo(parent.start)
                }
            )
        }
    }
}