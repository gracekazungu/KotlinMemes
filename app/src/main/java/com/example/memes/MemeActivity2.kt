package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity2 : AppCompatActivity() {
    lateinit var tvPrevious:TextView
    lateinit var tvNextview:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        tvPrevious=findViewById(R.id.tvPrevious)
        tvNextview=findViewById(R.id.tvNextview)
        tvPrevious.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        tvNextview.setOnClickListener {
            val intent=Intent(this,Meme3Activity::class.java)
            startActivity(intent)
        }
    }
}