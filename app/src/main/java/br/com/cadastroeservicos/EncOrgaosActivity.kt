package br.com.cadastroeservicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import br.com.cadastroeservicos.ui.components.EncOrgaos

class EncOrgaosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enc_orgaos)

        setContent {
            EncOrgaos()
        }

    }
}