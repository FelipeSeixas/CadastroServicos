package br.com.cadastroeservicos.ui.components

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun EnvioSucesso() {

    val context = LocalContext.current
    val openDialog = remember { mutableStateOf(true) }

    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = { openDialog.value = false },
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
//                        .align()
//                        .align(Alignment.Center),

                    onClick = {
                        openDialog.value = false

//                        Voltar para a tela inicial{TODO}
                        Toast.makeText(context, "Voltou para a tela de cadastro", Toast.LENGTH_SHORT).show()

                    }) {
                    Text(text = "Voltar para cadastro", color = Color.White)
                }
            },
        )
    }
}