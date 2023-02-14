package com.islam.lemonada

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.islam.lemonada.ui.theme.LemonadaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadaTheme {
                LemonadeApp()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LemonadeApp() {
    LemonTree()
}

@Composable
fun LemonTree() {
    var currentStep by remember { mutableStateOf(1) }
    when (currentStep) {
        1 -> Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(id = R.string.Tap_lemon), fontSize = 18.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                modifier = Modifier.clickable { currentStep = 2 },
                painter = painterResource(id = R.drawable.lemon_tree),
                contentDescription = "lemon_tree",
            )
        }
        2 -> Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(id = R.string.Keep_squeeze), fontSize = 18.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                modifier = Modifier.clickable {currentStep =3},
                painter = painterResource(id = R.drawable.lemon_squeeze),
                contentDescription = "lemon_tree",
            )
        }
        3->Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(id = R.string.Tap_drink), fontSize = 18.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                modifier = Modifier.clickable {currentStep =4},
                painter = painterResource(id = R.drawable.lemon_drink),
                contentDescription = "lemon_tree",
            )
        }
        4-> Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(id = R.string.Tap_glass_start_again), fontSize = 18.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                modifier = Modifier.clickable {currentStep =1},
                painter = painterResource(id = R.drawable.lemon_restart),
                contentDescription = "lemon_tree",
            )
        }
    }

}