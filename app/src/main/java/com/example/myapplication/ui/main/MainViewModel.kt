package com.example.myapplication.ui.main

import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    var message = ObservableField("Hello World！")

    fun onClickButton(v: View) {
        message.set("DataBinding OK!")
    }
}
