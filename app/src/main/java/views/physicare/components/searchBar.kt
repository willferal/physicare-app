package views.physicare.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchBar(
    query: String,
    onQueryChanged: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xffDED4D4))
            .padding(2.dp),
        verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search Icon",
            modifier = Modifier.padding(end = 8.dp)
        )

        BasicTextField(
            value = query,
            onValueChange = onQueryChanged,
            modifier = modifier
                .fillMaxWidth()
                .background(Color(0xffDED4D4))
                .padding(16.dp),
            singleLine = true,
            textStyle = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Normal, color = Color.Black)
        )
    }
}

@Composable
fun SearchBar() {
    var query by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .padding(16.dp)

    ) {
        SearchBar(
            query = query,
            onQueryChanged = { newQuery ->
                query = newQuery
            }
        )
    }
}
