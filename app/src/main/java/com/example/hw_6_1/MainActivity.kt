package com.example.hw_6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.hw_6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            btnInc.setOnClickListener {
                viewModel.inc()
            }
            btnDec.setOnClickListener {
                viewModel.dec()
            }
            viewModel.counterLv.observe(this@MainActivity){
                tvResult.text = it.toString()
            }
        }
    }
}