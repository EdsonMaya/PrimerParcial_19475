package com.example.primerparcial_19475

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerparcial_19475.ui.theme.PrimerParcial_19475Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimerParcial_19475Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Ajedrez()
                }
            }
        }
    }
}

@Composable
fun Ajedrez() {
    Row(
        modifier = Modifier
            .height(300.dp)
            .width(250.dp),
    ) {
    Column(
        modifier = Modifier.weight(1f),
        verticalArrangement = Arrangement.Center,
    ) {
        Box(modifier = Modifier
            .background(Color(0xFF69B00B))
            .size(50.dp)
        )
        Box(modifier = Modifier
            .background(Color(0xFFFFE4C4))
            .size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.black_rook),
                    contentDescription = "Rey negro",
                    modifier = Modifier.size(50.dp)
                )
            }
        Box(modifier = Modifier
            .background(Color(0xFF69B00B))
            .size(50.dp)
        )
        Box(modifier = Modifier
            .background(Color(0xFFFFE4C4))
            .size(50.dp)
        )
        Box(modifier = Modifier
            .background(Color(0xFF69B00B))
            .size(50.dp)
        )
        Box(modifier = Modifier
            .background(Color(0xFFFFE4C4))
            .size(50.dp)
        )
    }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.white_queen),
                    contentDescription = "Dama blanca",
                    modifier = Modifier.size(50.dp)
                )
            }
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.black_pawn),
                    contentDescription = "Peon negro",
                    modifier = Modifier.size(50.dp)
                )
            }
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.white_pawn),
                    contentDescription = "Peon blanco",
                    modifier = Modifier.size(50.dp)
                )
            }
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.black_pawn),
                    contentDescription = "Peon negro",
                    modifier = Modifier.size(50.dp)
                )
            }
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.white_pawn),
                    contentDescription = "Peon blanco",
                    modifier = Modifier.size(50.dp)
                )
            }
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.black_king),
                    contentDescription = "Rey negro",
                    modifier = Modifier.size(50.dp)
                )
            }
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.black_pawn),
                    contentDescription = "Peon negro",
                    modifier = Modifier.size(50.dp)
                )
            }
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.white_pawn),
                    contentDescription = "Peon blanco",
                    modifier = Modifier.size(50.dp)
                )
            }
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.whie_king),
                    contentDescription = "Rey blanco",
                    modifier = Modifier.size(50.dp)
                )
            }
        }
    }
    Spacer(modifier = Modifier.height(10.dp))

    Row(
        modifier = Modifier.fillMaxHeight()
    ) {

    }


}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimerParcial_19475Theme {
        Ajedrez()
    }
}