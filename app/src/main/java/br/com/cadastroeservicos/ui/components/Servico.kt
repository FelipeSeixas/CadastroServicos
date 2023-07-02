package br.com.cadastroeservicos.ui.components

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.cadastroeservicos.EncMotivoActivity
import br.com.cadastroeservicos.ServiceActivity2


/*
@Preview
@Composable
fun servico(){
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

    Text(text = "Selecione o serviço")
}
*/


@Preview(
    showBackground = true
)
@Composable
fun ListaServicos(){
    val servicos = listOf("Encaminhamento", "Acompanhamento", "Abordagem social", "Acolhimento", "SCFV")
    val (selecionado, escolherServico) = remember { mutableStateOf<String?>(null) }

    Column(Modifier.padding(16.dp)) {


        Row(
            Modifier
                .fillMaxWidth(0.9f)
                .padding(bottom = 34.dp)
                .background(Color.Blue)
        ) {
            Text(
                text = "Cadastro",
                color = Color.White
            )
        }

        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = "Selecione o serviço"
        )

        Column(
            modifier = Modifier
                .padding(top = 34.dp)
        ) {
            servicos.forEach { servico ->
                Row(
                    Modifier
                        .width(347.dp)
//                        .fillMaxWidth()
                        .selectable(
                            selected = (servico == selecionado),
                            onClick = { escolherServico(servico) }
                        )
                        .padding(start = 16.dp, end = 8.dp)
                    //     .align(Alignment.CenterVertically)

                ) {
                    Text(
                        text = servico,
                        modifier = Modifier
//                        .padding(start = 16.dp)
                            .width(230.dp)
                            .align(Alignment.CenterVertically)


                    )
                    RadioButton(
//                        modifier = Modifier.a
                        selected = (servico == selecionado),
                        onClick = { escolherServico(servico) }
                    )
                }
            }


        }


        var context = LocalContext.current

        Button(
            onClick = {
                val intent = Intent(context, EncMotivoActivity::class.java)
                context.startActivity(intent)
            },

            modifier = Modifier
//                .padding(start = 36.dp, top = 380.dp)
                .padding(start = 60.dp, top = 100.dp)
                .width(250.dp)
                .height(56.dp)
//            .absoluteOffset(x = 82.dp, y = 574.dp)

        ) {
            Text("Continuar")
        }
    }

}
