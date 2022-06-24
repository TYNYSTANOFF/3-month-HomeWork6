package com.example.a3_month_homework6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a3_month_homework6.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
            binding= ActivitySecondBinding.inflate(layoutInflater)
            setContentView(binding.root)
            val arguments = intent.extras
            val name = arguments?.get("key1").toString()
            binding.tvCount2.text = name
        }
    }
