package com.nikhilanand.newsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nikhilanand.newsapp.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


}