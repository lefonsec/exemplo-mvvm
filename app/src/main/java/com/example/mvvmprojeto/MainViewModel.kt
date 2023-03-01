package com.example.mvvmprojeto

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var textHello = MutableLiveData<String>()

    init {
        textHello.value = "Olá"
    }

    fun welcome():LiveData<String>{
        return textHello
    }
}