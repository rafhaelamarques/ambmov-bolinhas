package br.com.cotemig.bolinhas

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn1 = findViewById<Button>(R.id.layout1)
        var btn2 = findViewById<Button>(R.id.layout2)
        var btn3 = findViewById<Button>(R.id.layout3)
        var btn4 = findViewById<Button>(R.id.layout4)
        var btn5 = findViewById<Button>(R.id.layout5)
        var btn6 = findViewById<Button>(R.id.layout6)
        var btn7 = findViewById<Button>(R.id.layout7)
        var btn8 = findViewById<Button>(R.id.layout8)
        var btn9 = findViewById<Button>(R.id.layout9)
        var btn10 = findViewById<Button>(R.id.layout10)
        var btn11 = findViewById<Button>(R.id.layout11)
        var btn12 = findViewById<Button>(R.id.layout12)
        var btn13 = findViewById<Button>(R.id.layout13)
        var btn14 = findViewById<Button>(R.id.layout14)

        btn1.setOnClickListener {
            val intent = Intent(this, LayoutActivity1::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, LayoutActivity2::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, LayoutActivity3::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener {
            val intent = Intent(this, LayoutActivity4::class.java)
            startActivity(intent)
        }

        btn5.setOnClickListener {
            val intent = Intent(this, LayoutActivity5::class.java)
            startActivity(intent)
        }

        btn6.setOnClickListener {
            val intent = Intent(this, LayoutActivity6::class.java)
            startActivity(intent)
        }

        btn7.setOnClickListener {
            val intent = Intent(this, LayoutActivity7::class.java)
            startActivity(intent)
        }

        btn8.setOnClickListener {
            val intent = Intent(this, LayoutActivity8::class.java)
            startActivity(intent)
        }

        btn9.setOnClickListener {
            val intent = Intent(this, LayoutActivity9::class.java)
            startActivity(intent)
        }

        btn10.setOnClickListener {
            val intent = Intent(this, LayoutActivity10::class.java)
            startActivity(intent)
        }

        btn11.setOnClickListener {
            val intent = Intent(this, LayoutActivity11::class.java)
            startActivity(intent)
        }

        btn12.setOnClickListener {
            val intent = Intent(this, LayoutActivity12::class.java)
            startActivity(intent)
        }

        btn13.setOnClickListener {
            val intent = Intent(this, LayoutActivity13::class.java)
            startActivity(intent)
        }

        btn14.setOnClickListener {
            val intent = Intent(this, LayoutActivity14::class.java)
            startActivity(intent)
        }

    }
}
