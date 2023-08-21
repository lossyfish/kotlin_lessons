package com.example.test_app

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test_app.databinding.ActivityMainBinding
import com.example.test_app.databinding.WindowTestBinding

class WindowTest : AppCompatActivity(){

    private lateinit var windowexe: WindowTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        windowexe = WindowTestBinding.inflate(layoutInflater)
        setContentView(windowexe.root)

        windowexe.btn2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}