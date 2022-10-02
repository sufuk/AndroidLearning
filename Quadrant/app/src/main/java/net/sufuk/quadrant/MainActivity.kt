package net.sufuk.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.sufuk.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MakePage()
                }
            }
        }
    }
}

@Composable
fun MakeQuad(header: String, body: String, backgroundColor: ULong, modifier: Modifier = Modifier ) {
    Column(
        modifier = modifier
            .background(color = Color(backgroundColor))
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        Text(text = header, fontWeight = FontWeight.Bold, textAlign = TextAlign.Justify, modifier = Modifier
            .padding(bottom = 16.dp))
        Text(text = body, textAlign = TextAlign.Justify)
    }


}

@Composable
fun MakePage() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier
            .weight(weight = 1f, fill =true),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            MakeQuad(stringResource(id = R.string.header_1), stringResource(id = R.string.text_1), androidx.compose.ui.graphics.Color.Green.value, modifier = Modifier.weight(weight = 1f, fill = true))
            MakeQuad(stringResource(id = R.string.header_2), stringResource(id = R.string.text_2), androidx.compose.ui.graphics.Color.Yellow.value, modifier = Modifier.weight(weight = 1f, fill = true))
        }
        Row(modifier = Modifier.weight(weight = 1f, fill =true)
        ) {
            MakeQuad(stringResource(id = R.string.header_3), stringResource(id = R.string.text_3), androidx.compose.ui.graphics.Color.Cyan.value, modifier = Modifier.weight(weight = 1f, fill = true))
            MakeQuad(stringResource(id = R.string.header_4), stringResource(id = R.string.text_4), androidx.compose.ui.graphics.Color.LightGray.value, modifier = Modifier.weight(weight = 1f, fill = true))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QuadrantTheme {
        MakePage()
    }
}