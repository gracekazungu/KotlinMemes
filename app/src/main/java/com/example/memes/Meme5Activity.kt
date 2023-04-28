package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Meme5Activity : AppCompatActivity() {
    lateinit var tvPrevious:TextView
    lateinit var tvNext:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        tvPrevious=findViewById(R.id.tvPrevious)
        tvNext=findViewById(R.id.tvNext)
        tvPrevious.setOnClickListener {
            intent= Intent(this,Meme4Activity2::class.java)
            startActivity(intent)
        }
        tvNext.setOnClickListener {
            intent=Intent(this,Meme6Activity2::class.java)
            startActivity(intent)
        }
    }
}