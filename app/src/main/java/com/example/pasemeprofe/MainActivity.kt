package com.example.pasemeprofe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaDNI()
        }
    }
}

@Composable
fun PantallaDNI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.fondo))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = stringResource(id = R.string.nombre_alumno), fontSize = 18.sp)

        Spacer(modifier = Modifier.height(30.dp))


        Image(
            painter = painterResource(id = R.drawable.perfil2),
            contentDescription = "Foto",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF192A54),
                contentColor = Color.White
            )
        ) {
            Text(
                text = stringResource(id = R.string.boton),
                fontSize = 15.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column(horizontalAlignment = Alignment.Start) {
            Text("DNI: ${stringResource(id = R.string.dni)}", fontSize = 18.sp)
            Text("Apellidos: ${stringResource(id = R.string.apellidos)}", fontSize = 18.sp)
            Text("Nombre: ${stringResource(id = R.string.nombre_alumno)}", fontSize = 18.sp)
            Text("Nacimiento: ${stringResource(id = R.string.nacimiento)}", fontSize = 18.sp)
            Text("Sexo: ${stringResource(id = R.string.sexo)}", fontSize = 18.sp)
            Text("Validez: ${stringResource(id = R.string.validez)}", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF27BBF5),
                contentColor = Color.White
            )
        ) {
            Text(
                text = stringResource(id = R.string.boton2),
                fontSize = 15.sp
            )
        }

    }
}
