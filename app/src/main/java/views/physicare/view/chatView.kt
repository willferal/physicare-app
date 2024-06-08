//package views.physicare.view
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import views.physicare.ui.theme.primaryBlue
//import views.physicare.ui.theme.secondaryBlue
//
//data class Message(val author: String, val content: String)
//
//@Composable
//fun TelaChat(navController: NavController) {
//    var messages by remember { mutableStateOf(listOf<Message>()) }
//    var currentMessage by remember { mutableStateOf(TextFieldValue()) }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                Brush.linearGradient(listOf(primaryBlue, secondaryBlue))
//            ),
//        verticalArrangement = Arrangement.SpaceBetween,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        LazyColumn(
//            modifier = Modifier
//                .weight(1f)
//                .fillMaxWidth(),
//            reverseLayout = true
//        ) {
//            items(messages.size) { index ->
//                MessageCard(messages[index])
//            }
//        }
//        Row(
//            modifier = Modifier
//                .padding(8.dp)
//                .background(Color.LightGray)
//                .fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            BasicTextField(
//                value = currentMessage,
//                onValueChange = { currentMessage = it },
//                modifier = Modifier
//                    .weight(1f)
//                    .padding(8.dp)
//            )
//            Spacer(modifier = Modifier.size(8.dp))
//            Button(
//                onClick = {
//                    if (currentMessage.text.isNotBlank()) {
//                        messages = messages + Message("You", currentMessage.text)
//                        currentMessage = TextFieldValue()
//                    }
//                }
//            ) {
//                Text(text = "Send")
//            }
//        }
//    }
//}
//
//@Composable
//fun MessageCard(message: Message) {
//    Card(
//        modifier = Modifier
//            .padding(8.dp)
//            .fillMaxWidth(),
//        colors = CardDefaults.cardColors(
//            containerColor = if (message.author == "You") Color.Cyan else Color.White
//        )
//    ) {
//        Column(modifier = Modifier.padding(8.dp)) {
//            Text(
//                text = message.author,
//                style = MaterialTheme.typography.bodySmall.copy(fontSize = 14.sp)
//            )
//            Spacer(modifier = Modifier.height(4.dp))
//            Text(
//                text = message.content,
//                style = MaterialTheme.typography.bodyMedium
//            )
//        }
//    }
//}

package views.physicare.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

data class Message(val author: String, val content: String)

@Composable
fun TelaChat(navController: NavController) {
    var messages by remember { mutableStateOf(listOf<Message>()) }
    var currentMessage by remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F4F8)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            reverseLayout = true
        ) {
            items(messages.size) { index ->
                MessageCard(messages[index])
            }
        }
        Row(
            modifier = Modifier
                .padding(8.dp)
                .background(Color.White)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            BasicTextField(
                value = currentMessage,
                onValueChange = { currentMessage = it },
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.size(8.dp))
            Button(
                onClick = {
                    if (currentMessage.text.isNotBlank()) {
                        messages = messages + Message("You", currentMessage.text)
                        currentMessage = TextFieldValue()
                    }
                }
            ) {
                Text(text = "Send")
            }
        }
    }
}

@Composable
fun MessageCard(message: Message) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = if (message.author == "You") Color(0xFF1E90FF) else Color.LightGray
        )
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = message.author,
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 14.sp, color = if (message.author == "You") Color.White else Color.Black)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = message.content,
                style = MaterialTheme.typography.bodyMedium.copy(color = if (message.author == "You") Color.White else Color.Black)
            )
        }
    }
}
