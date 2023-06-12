package com.example.simplescrollactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    lateinit var txtpizza:CardView
    lateinit var txtchipo:CardView
    lateinit var txtjuice:CardView
    lateinit var txthotdog:CardView
    lateinit var txtsoda:CardView
    lateinit var txtbugger:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtpizza = findViewById(R.id.pizza)
        txtchipo = findViewById(R.id.chips)
        txtjuice = findViewById(R.id.juice)
        txthotdog = findViewById(R.id.soda)
        txtbugger = findViewById(R.id.bugger)

        txtpizza.setOnClickListener {
            val intent = Intent(this,pizzaActivity2::class.java)
            startActivity(intent)
        }
        txtchipo.setOnClickListener {
            val intent = Intent(this,chipoActivity::class.java)
            startActivity(intent)
        }
        txtjuice.setOnClickListener {
            val intent = Intent(this,juiceActivity::class.java)
            startActivity(intent)
        }
        txthotdog.setOnClickListener {
            val intent = Intent(this,hotdogActivity2::class.java)
            startActivity(intent)
        }
        txtbugger.setOnClickListener {
            val intent = Intent(this,buggerActivity::class.java)
            startActivity(intent)
        }




    }
}