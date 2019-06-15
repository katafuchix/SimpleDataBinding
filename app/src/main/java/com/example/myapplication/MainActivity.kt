package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.ui.main.MainViewModel
import com.example.myapplication.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val binding = DataBindingUtil.setContentView<MainActivityBinding>(this, R.layout.main_activity)
        binding.viewModel = MainViewModel()
    }
}
