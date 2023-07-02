package br.com.cadastroeservicos.ui.components

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.cadastroeservicos.ServiceActivity2

//import br.com.cadastroeservicos.ui.components.Servico


@Preview(
    showBackground = true
)
@Composable
fun DadosUsuario(){

    var nome by remember { mutableStateOf(TextFieldValue("")) }
    var cpf by remember { mutableStateOf(TextFieldValue("")) }
    var data by remember { mutableStateOf(TextFieldValue("")) }
    var cel by remember { mutableStateOf(TextFieldValue("")) }


    Row(
        Modifier
            .fillMaxWidth(0.9f)
            .padding(16.dp)
            .background(Color.Blue)
    ) {
        Text(
            text = "Cadastro",
            color = Color.White
        )
    }

    Column(
        Modifier
            .padding(
                top = 84.dp,
                start = 36.dp,
                end = 16.dp,
                bottom = 16.dp
            )
            .fillMaxWidth()

//    TextFields (nome, cpf, data e cel)
    ) {
        TextField(
            value = nome,
            onValueChange = {
                nome = it
            },
            label = { Text(text = "Nome completo") },
            placeholder = { Text(text = "Ex: Maria da Silva") },
        )

        TextField(
            value = cpf,
            onValueChange = {
                cpf = it
            },
            label = { Text(text = "CPF") },
            placeholder = { Text(text = "000.000.000-00") },
        )

        TextField(
            value = data,
            onValueChange = {
                data = it
            },
            label = { Text(text = "Data de nascimento") },
            placeholder = { Text(text = "00/00/0000") },
        )

        TextField(
            value = cel,
            onValueChange = {
                cel = it
            },
            label = { Text(text = "Telefone celular") },
            placeholder = { Text(text = "(99) 9999-9999") },
        )

    }

//    var showService by remember { mutableStateOf(false) }

    var context = LocalContext.current

    Button(
        onClick = {
            val intent = Intent(context, ServiceActivity2::class.java)
            context.startActivity(intent)
        },

        modifier = Modifier
            .padding(start = 36.dp, top = 334.dp)
            .width(250.dp)
            .height(56.dp)
//            .absoluteOffset(x = 82.dp, y = 574.dp)

    ) {
        Text("Cadastrar")
    }


}