package br.com.cadastroeservicos.ui.components

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.cadastroeservicos.*
import br.com.cadastroeservicos.R


@Preview
    (showBackground = true)
@Composable
fun EncMotivo(){

    var nome: String = "Antônio da Silva Figueiredo"
    var cpf: String = "012.345.678-90"
    var data: String = "01/10/1950"
    var idade: String = "62"

    val whiteCustomColor = Color(0xFFF5F5F5)

    var context = LocalContext.current


    Column(

    ) {
        Text(text = nome)

        Text(text = "CPF: $cpf")

        Row(Modifier.padding(bottom = 32.dp)) {
            Text(
                text = "Data de nascimento: $data",
                modifier = Modifier.padding(end = 36.dp)
            )

            Text(text = "Idade: $idade anos")
        }

        Row(
            Modifier
                .width(370.dp)
                .padding(vertical = 8.dp)
        ) {

            ClickableText(
                text = AnnotatedString("Encaminhar"),
                onClick = {
                    Toast.makeText(context, "A opção encaminhar foi pressionada", Toast.LENGTH_SHORT).show()
                    val intent = Intent(context, EncOrgaosActivity::class.java)
                    context.startActivity(intent)
                })

            Spacer(Modifier.weight(0.8f))

            Image(
                painter = painterResource(id = R.drawable.ic_baseline_arrow_forward_ios_24),
                contentDescription = "Seguir"
            )
        }

        Row(
            Modifier
                .width(370.dp)
                .background(whiteCustomColor)
        ) {

            ClickableText(text = AnnotatedString("Motivo"), onClick = {
                Toast.makeText(context, "A opção motivo foi pressionada", Toast.LENGTH_SHORT).show()

                val intent = Intent(context, MotivoActivity::class.java)
                context.startActivity(intent)
            })

            Spacer(Modifier.weight(0.4f))
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_arrow_forward_ios_24),
                contentDescription = "Seguir"
            )
        }
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 180.dp)
            .background(Color.Transparent),
        horizontalArrangement = Arrangement.Center
    ) {

//        Cancelar
        var context = LocalContext.current

        Button(
            onClick = {
                val intent = Intent(context, ServiceActivity2::class.java)
                context.startActivity(intent)
            },

            Modifier
                .background(Color.White)
                .padding(end = 16.dp)
                .size(169.dp, 56.dp),
        ) {
            Text("Cancelar", color = Color.White)
        }


        var showDialog = remember { mutableStateOf(false) }

        var confirmDialog = remember { mutableStateOf(false) }

//        Encaminhar
        Button(
            onClick = {showDialog.value = true},

            Modifier
                .background(Color.Transparent)
                .size(169.dp, 56.dp),

            ) {
            Text("Encaminhar", color = Color.White)
        }

        if (showDialog.value){

//            Deseja confirmar o encaminhamento?
            AlertDialog(
                onDismissRequest = { showDialog.value = false },
                title = {
                    Text(
                        text = "Deseja confirmar o encaminhamento?",
                        color = Color.Black)
                },

                //            Confirmar
                confirmButton = {
                    TextButton(
                        border = BorderStroke(1.dp,Color.Blue),
                        modifier = Modifier.background(Color.Blue),

                        onClick = {
//                                                showDialog.value = false

                            confirmDialog.value = true

                            Toast.makeText(context, "Confirmado!", Toast.LENGTH_SHORT).show()

                        }) {
                        Text(text = "Confirmar", color = Color.White)
                    }

                    if (confirmDialog.value) {

                        AlertDialog(
                            onDismissRequest = { confirmDialog.value = false },
                            title = {
                                Text(
                                    text = "Encaminhamento realizado com sucesso!",
                                    color = Color.Black)
                            },

//            Confirmar
                            confirmButton = {

                                TextButton(
                                    border = BorderStroke(1.dp,Color.Blue),
                                    modifier = Modifier
                                        .background(Color.Blue),

                                    onClick = {
//                        Voltar para a tela inicial
                                        showDialog.value = false
                                        confirmDialog.value = false

                                        val intent = Intent(context, MainActivity::class.java)
                                        context.startActivity(intent)

                                        Toast.makeText(context, "Voltou para a tela de cadastro", Toast.LENGTH_SHORT).show()

                                    }) {
                                    Text(text = "Voltar para cadastro", color = Color.White)
                                }
                            },
                        )
                    }

                },

                //            Cancelar
                dismissButton = {
                    TextButton(
                        border = BorderStroke(1.dp,Color.Blue),
                        onClick = {
                            showDialog.value = false
                            Toast.makeText(context, "Não realizado!", Toast.LENGTH_SHORT).show()
                        }) {
                        Text(text = "Cancelar", color = Color.Blue)
                    }
                },
            )
        }
    }
}