package com.example.appfirestore

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavegarCadastrar: Button = findViewById(R.id.btnNavegarCadastrar)
        val btnNavegarConsultar: Button = findViewById(R.id.btnNavegarConsultar)
        val btnNavegarEditar: Button = findViewById(R.id.btnNavegarEditar)
        val btnNavegarDeletar: Button = findViewById(R.id.btnNavegarDeletar)

        btnNavegarCadastrar.setOnClickListener {
            val intent = Intent(this, Activity_create::class.java)
            startActivity(intent)
        }
        btnNavegarConsultar.setOnClickListener {
            val intent = Intent(this, Activity_list::class.java)
            startActivity(intent)
        }
        btnNavegarEditar.setOnClickListener {
            val intent = Intent(this, Activity_update::class.java)
            startActivity(intent)
        }
        btnNavegarDeletar.setOnClickListener {
            val intent = Intent(this, Activity_delete::class.java)
            startActivity(intent)
        }
    }


}