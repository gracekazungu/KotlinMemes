package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Meme4Activity2 : AppCompatActivity() {
    lateinit var tvPreviouss:TextView
    lateinit var tvNextt:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme42)
        tvPreviouss=findViewById(R.id.tvPreviouss)
        tvNextt=findViewById(R.id.tvNextt)
        tvPreviouss.setOnClickListener {
            intent= Intent(this,Meme3Activity::class.java)
            startActivity(intent)
        }
        tvNextt.setOnClickListener {
            intent=Intent(this,Meme5Activity::class.java)
            startActivity(intent)
        }
    }
}