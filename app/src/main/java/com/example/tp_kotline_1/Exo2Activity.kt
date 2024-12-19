package com.example.tp_kotline_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Exo2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exo2)

        val tailleInput = findViewById<EditText>(R.id.editTextNumberDecimal)
        val poidsInput = findViewById<EditText>(R.id.editTextNumberDecimal2)
        val btn = findViewById<Button>(R.id.button2)

        btn.setOnClickListener {
            val taile = tailleInput.text.toString().toDouble()
            val poids = poidsInput.text.toString().toDouble()
            if (taile < 0 || poids <0 || taile == null || poids == null ){
                Toast.makeText(this,"invalid values",Toast.LENGTH_LONG).show()
            }else{
                val IMC = poids/(taile*taile)
                val intent = Intent(this,Exo2ResultActivity::class.java)
                intent.putExtra("result",IMC)
                startActivity(intent)
            }
        }



    }
}