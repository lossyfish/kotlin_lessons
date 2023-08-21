package com.example.test_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.test_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var launcher:ActivityResultLauncher<Intent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Сначала создает коллбэек функция лаунчер
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result: ActivityResult->
            if(result.resultCode == RESULT_OK){
                // В этой части кода мы получаем данные из второго активити по ключу кей1
                val text = result.data?.getStringExtra("key1")
                Log.d("MyLog","Result from MainActivity2 $text")
            }
        }

    }
    //В этой части кода мы обрабатываем нажатие на батон1 вызываем лаунчер и передаем второе активити
    fun onClick(view: View){
        launcher?.launch(Intent(this, MainActivity2::class.java))
    }
}