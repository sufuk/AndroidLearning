package net.sufuk.composearticleapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.sufuk.composearticleapp.ui.theme.ComposeArticleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleAppTheme {
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
fun MakeBackground() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .wrapContentHeight(align = Alignment.Top),
    )
}
@Composable
fun MakeHeader() {
    Text(
        text = stringResource(id = R.string.jetpack_compose_tutorial),
        fontSize = 20.sp,
        modifier = Modifier
            .wrapContentWidth(align = Alignment.Start)
            .padding(start = 16.dp, top = 16.dp, end = 16.dp))
}
@Composable
fun MakeSummary() {
    Text(
        text = stringResource(id = R.string.jetpack_compose_summary),
        fontSize = 16.sp,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .wrapContentWidth(align = Alignment.Start)
            .padding(start = 16.dp, top = 16.dp, end = 16.dp))
}
@Composable
fun MakeArticle() {
    Text(
        text = stringResource(id = R.string.jetpack_compose_article),
        fontSize = 16.sp,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .wrapContentWidth(align = Alignment.Start)
            .padding(start = 16.dp, top = 16.dp, end = 16.dp))
}

@Composable
fun MakePage(){
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            MakeBackground()
            MakeHeader()
            MakeSummary()
            MakeArticle()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleAppTheme {
        MakePage()
    }
}