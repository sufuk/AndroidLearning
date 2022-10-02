package net.sufuk.buisnesscard

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.sufuk.buisnesscard.ui.theme.BuisnessCardTheme
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Share
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuisnessCardTheme {
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
fun MakePage() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.DarkGray)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = R.drawable.android_logo)
        Image(painter = image, contentDescription = null, modifier = Modifier
            .height(120.dp)
            .width(150.dp))
        Text(text = "Sufuk",color = Color.White)
        Text(text = "Banking Application Developer",color = Color(0xFF3ddc84))

    }

    Column(
        modifier = Modifier

            .fillMaxWidth()
            .padding(top = 550.dp)
            .padding(bottom = 70.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    )
    {
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),

            ){
            Icon(Icons.Rounded.Call, contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
            )
            Text(text = "00 000 000 00 00", modifier = Modifier.padding(start = 25.dp),color = Color.White)

        }

        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),

            ){
            Icon(Icons.Rounded.Email, contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
            )
            Text(text = "sufukguler@gmail.com", modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }

        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),

            ){
            Icon(Icons.Rounded.Share, contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
            )
            Text(text = "@sufuk", modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BuisnessCardTheme {
        MakePage()
    }
}