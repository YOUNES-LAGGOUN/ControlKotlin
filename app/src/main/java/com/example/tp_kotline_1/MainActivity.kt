package com.example.tp_kotline_1


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.editTextNumberDecimal3)
        val valBtn = findViewById<Button>(R.id.button)
        val img = findViewById<ImageView>(R.id.imageView)
        val exo2Btn = findViewById<Button>(R.id.button3)
        exo2Btn.setOnClickListener {
            val i = Intent(this,Exo2Activity::class.java)
            startActivity(i)
        }

        valBtn.setOnClickListener {
            val inpNum = input.text.toString().toDouble()
            if (inpNum >= 1050){
                img.setImageResource(R.drawable.dry)
                img.visibility= View.VISIBLE
            }else if(inpNum >= 1030 && inpNum < 1050){
                img.setImageResource(R.drawable.sunny)
                img.visibility= View.VISIBLE
            }else if(inpNum >= 1010 && inpNum < 1030){
                img.setImageResource(R.drawable.cloudy)
                img.visibility= View.VISIBLE
            }else if(inpNum >= 1000 && inpNum < 1010){
                img.setImageResource(R.drawable.lightrain)
                img.visibility= View.VISIBLE
            }
            else if(inpNum >= 980 && inpNum < 1000){
                img.setImageResource(R.drawable.heavyrain)
                img.visibility= View.VISIBLE
            }
            else if(inpNum >= 970 && inpNum < 980){
                img.setImageResource(R.drawable.thunder)
                img.visibility= View.VISIBLE
            }else if(inpNum < 950 && inpNum >900){
                img.setImageResource(R.drawable.snow)
                img.visibility= View.VISIBLE
            }else if(inpNum <900 || inpNum > 1100){
                Toast.makeText(this,"Error: Enter a valid value",Toast.LENGTH_LONG).show()
            }
        }

        }

}
