package org.academiaantioquenadehistoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPinacoteca = findViewById(R.id.buttonPinacoteca) as Button

        btnPinacoteca.setOnClickListener {
            val intent = Intent(this, MainPinacoteca::class.java)
            startActivity(intent)
        }

        val btnOpac = findViewById(R.id.buttonOpac) as Button

        btnOpac.setOnClickListener {
            val intent = Intent(this, MainOpac::class.java)
            startActivity(intent)
        }

        val btnRepertorio = findViewById(R.id.buttonRepertorio) as Button

        btnRepertorio.setOnClickListener {
            val intent = Intent(this, MainRepertorio::class.java)
            startActivity(intent)
        }
    }
}