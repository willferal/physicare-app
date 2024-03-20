package views.physicare.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import views.physicare.ui.theme.primaryBlue

@Composable
fun CaixaTexto(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    label: String
){
    OutlinedTextField(
        value = value,
        onValueChange,
        modifier,
        label = {
            Text(text = label)
        },
        maxLines = 1,
        colors = TextFieldDefaults.colors(
            disabledTextColor = Color.Black,
            focusedContainerColor = primaryBlue
        )
    )
}

@Composable
@Preview
private fun CTpreview(){
    CaixaTexto(value ="Marcos",
        onValueChange ={},
        modifier =Modifier.fillMaxWidth(),
        label ="Descricao")
}