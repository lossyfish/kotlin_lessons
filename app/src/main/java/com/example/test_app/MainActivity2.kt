package com.example.test_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
 // В этой функции при нажатии на батон2 мы отправляем по ключу кей1 текст доне
    fun onClick(view: View){
        val i = Intent()
        i.putExtra("key1","done")
        setResult(RESULT_OK,i)
        finish()
    }
}