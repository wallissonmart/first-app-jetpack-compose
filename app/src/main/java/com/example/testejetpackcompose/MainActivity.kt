package com.example.testejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testejetpackcompose.ui.theme.TesteJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyProfileScreen()
        }
    }
}

@Composable
fun MyProfileScreen() {
    Scaffold(
        topBar = {
            TopAppBar (
            title = {Text("Teste")},
            backgroundColor = MaterialTheme.colors.primaryVariant)
            },
        content = { Text("Conteúdo",
            modifier = Modifier.padding(all = 50.dp)
        ) },
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyProfileScreen()
}