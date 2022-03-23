package com.example.mycompose9_theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycompose9_theme.ui.theme.MyCompose9ThemeTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCompose9ThemeTheme {
                MyContent()
            }
        }
    }
}


@Composable
fun MyContent() {
    val scaffoldState = rememberScaffoldState()
    var coroutineScope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopAppBar(
            title = { Text(text = stringResource(id = R.string.app_name))},
            navigationIcon = {
                IconButton(onClick = { coroutineScope.launch { scaffoldState.drawerState.open() }}) {
                    Icon(Icons.Default.Menu, contentDescription =null )
                }
            }) },
        floatingActionButton = { FloatingActionButton(onClick = {  }) {
            Icon(Icons.Filled.Add, contentDescription =null )
        }},
        drawerScrimColor = Color.Red,
        drawerContent = {
            Icon(Icons.Default.Settings, contentDescription = null)
            Icon(Icons.Default.Share, contentDescription = null)
            Icon(Icons.Default.Person, contentDescription = null)
            Icon(Icons.Default.Phone, contentDescription = null)
            Icon(Icons.Default.AccountCircle, contentDescription = null)
            Icon(Icons.Default.Favorite, contentDescription = null)
            Icon(Icons.Default.Settings, contentDescription = null)
        }
    ){}
}


