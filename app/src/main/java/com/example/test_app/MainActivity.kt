package com.example.test_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.test_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {

            when(binding.editText.text.toString().toInt()){
            in 0..200 -> {
                binding.textView2.visibility = View.VISIBLE
                binding.textView2.text = "You are a bad streamer"
                binding.imageView.visibility = View.VISIBLE
                binding.imageView.setImageResource(R.drawable.img2)
            }
            in 201..500 -> {
                binding.textView2.visibility = View.VISIBLE
                binding.textView2.text = "You are a good streamer"
                binding.imageView.visibility = View.VISIBLE
                binding.imageView.setImageResource(R.drawable.img1)
            }
            else -> {
                binding.textView2.visibility = View.VISIBLE
                binding.textView2.text = "You are a super star"
                binding.imageView.visibility = View.VISIBLE
                binding.imageView.setImageResource(R.drawable.img3)
            }
            }
        }
    }
}