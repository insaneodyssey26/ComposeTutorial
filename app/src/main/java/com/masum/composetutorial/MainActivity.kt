package com.masum.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.masum.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TutorialApp()
        }
    }
}

@Composable
fun TutorialApp() {
    Article(
    title =  stringResource(R.string.jetpack_compose_tutorial_title),
    subheading =  stringResource(R.string.jetpack_compose_tutorial_subtitle),
    content =  stringResource(R.string.jetpack_compose_tutorial_body),
        bgimage = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
fun Article(
    title: String,
    subheading: String,
    content: String,
    bgimage: Painter,
    modifier: Modifier = Modifier,
) {

}

