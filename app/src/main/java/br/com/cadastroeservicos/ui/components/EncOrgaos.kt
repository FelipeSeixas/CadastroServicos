package br.com.cadastroeservicos.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable

fun EncOrgaos() {

    BottomSheetScaffold(
        sheetContent = {
            Column (

                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(0.4f),
                horizontalAlignment = Alignment.CenterHorizontally

            ){

                Text("CRAS", modifier = Modifier.padding(vertical = 4.dp))
                Text("CREAS", modifier = Modifier.padding(vertical = 4.dp))
                Text("Defensoria pública", modifier = Modifier.padding(vertical = 4.dp))
                Text("Ministério público", modifier = Modifier.padding(vertical = 4.dp))
                Text("Poder judiciário", modifier = Modifier.padding(bottom = 32.dp))
                
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(250.dp, 56.dp)
                        .clip(RoundedCornerShape(1.dp))
                    ) {
                    Text(text = "Salvar")
                }
            }
        }
    ) {

    }
}