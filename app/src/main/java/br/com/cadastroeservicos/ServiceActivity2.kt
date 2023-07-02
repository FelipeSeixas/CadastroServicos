package br.com.cadastroeservicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import br.com.cadastroeservicos.ui.components.ListaServicos

class ServiceActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service2)

        setContent {
            ListaServicos()
        }

    }
}