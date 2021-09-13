package com.example.jogodado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.NonNull
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        diceImage = findViewById(R.id.dice_image)
        val valRolarDado: Button = findViewById(R.id.btnRolar);
        valRolarDado.setOnClickListener {
            rolarDado();
        }
    }

    private fun rolarDado() {
        //Toast.makeText(this, "Cagão!!", Toast.LENGTH_SHORT).show();
        val valAleatorio = (1..6).random();
        val valDrawableResource = when (valAleatorio) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(valDrawableResource);
    }

/*    private fun Somar() {
        //Toast.makeText(this, "Testando Somar!", Toast.LENGTH_SHORT).show();
        val valImgNumSorteado: ImageView = findViewById(R.id.dice_image);
        val num = valImgNumSorteado.resources.getIdentifier("dice_image","drawable",this.packageName);
        valImgNumSorteado.setImageResource(num);
        Toast.makeText(this, num.toString(), Toast.LENGTH_SHORT).show();
    }*/
}