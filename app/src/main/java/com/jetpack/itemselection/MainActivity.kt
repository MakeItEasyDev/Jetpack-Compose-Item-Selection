package com.jetpack.itemselection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.itemselection.ui.theme.ItemSelectionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ItemSelectionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(
                                        text = "Item Selection",
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            )
                        }
                    ) {
                        ItemSelection()
                    }
                }
            }
        }
    }
}

@Composable
fun ItemSelection() {
    var selected1 by remember { mutableStateOf(false) }
    var selected2 by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(80.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SelectableItem(
            selected = selected1,
            title = "Make it Easy",
            onClick = {
                selected1 = !selected1
            }
        )

        Spacer(modifier = Modifier.height(12.dp))

        SelectableItem(
            selected = selected2,
            title = "Make it Easy",
            subtitle = "Here, we will learn to Jetpack Compose using Kotlin",
            onClick = {
                selected2 = !selected2
            }
        )
    }
}






















