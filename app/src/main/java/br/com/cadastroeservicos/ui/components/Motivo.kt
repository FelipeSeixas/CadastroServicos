package br.com.cadastroeservicos.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable

fun MotivoSheet(): Unit {

    var descricao by remember { mutableStateOf(TextFieldValue("")) }

    BottomSheetScaffold(
        sheetContent = {
            Column (

                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(0.9f)
                    .padding(horizontal = 24.dp),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally

            ){

             Row() {

                 TextButton(onClick = { /*TODO*/ }) {
                     Text(text = "Cancelar")
                 }

                 Spacer(Modifier.weight(1f))


                 TextButton(onClick = { /*TODO*/ }) {
                     Text(text = "Salvar")
                 }

             }

                Divider(
                    modifier = Modifier.padding(vertical = 8.dp),
                    color = Color.Gray,
                    thickness = 1.dp
                )

                Text("Motivo", modifier = Modifier
                    .padding(
                        top = 8.dp,
                        bottom = 12.dp)
                    )

                OutlinedTextField(
                    value = descricao,
                    onValueChange = {
                        descricao = it
                    },
                    modifier = Modifier.fillMaxWidth(1f),
                    label = { Text(text = "Descreva aqui o motivo do encaminhamento") },

                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    )
                )
            }
        }
    ) {
        // Conteúdo principal aqui
    }
}