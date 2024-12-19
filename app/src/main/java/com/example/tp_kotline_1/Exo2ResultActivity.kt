package com.example.tp_kotline_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Exo2ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exo2_result)

        val resultV = findViewById<TextView>(R.id.resultView)
        val layoutC = findViewById<ConstraintLayout>(R.id.main)
        val drkBtn = findViewById<Button>(R.id.drkBtn)

        drkBtn.setOnClickListener {

        }

        val res = intent.getStringExtra("result")
        resultV.text=res.toString()

    }
}