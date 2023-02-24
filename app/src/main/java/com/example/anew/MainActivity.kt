package com.example.anew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.anew.R.*

class MainActivity() : AppCompatActivity() {
    private var count: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val nameAisha = findViewById<TextView>(id.text_aisha)
        val foto = findViewById<ImageView>(id.foto)
        val button: Button = findViewById(id.button_change_name)

        button.setOnClickListener {
            count += 1
            if (count == 4) count = 1
            if (count == 1) {
                foto.setImageResource(drawable.ic_bobka)
                nameAisha.text = "Бобка красавчик!"
                button.text = "Покажи мурку"
            }
            if (count == 2) {
                foto.setImageResource(drawable.ic_murka)
                button.text = "покажи бибку"
                nameAisha.text = "Мурка зверь!"
            }
            if (count == 3) {
                foto.setImageResource(drawable.ic_bibka)
                button.text = "покажи бобку"
                nameAisha.text = "Бибка красавица!"
            }
        }
    }
}









