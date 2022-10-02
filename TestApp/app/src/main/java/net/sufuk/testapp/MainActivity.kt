package net.sufuk.testapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.sufuk.testapp.ui.theme.TestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage("Sufuk", "Cigdem")
                }
            }
        }
    }
}

@Composable
fun BirthDayGreetingWithText(name: String, from: String) {
    Column(content =  {
        Text(text = stringResource(R.string.happy_birthday_message) + " $name!",
            fontSize = 34.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp))
        Text(text = "From $from",
            fontSize = 12.sp,
            modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(end = 16.dp, top = 16.dp))
    })

}
@Composable
fun BirthdayGreetingWithImage(name: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    //Step 3 create a box to overlap image and texts
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight().fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        BirthDayGreetingWithText(name = name, from = from)
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestAppTheme {
        BirthdayGreetingWithImage("Sufuk", "Cigdem")
    }
}