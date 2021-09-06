package com.example.counterapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var num = 0
    fun plusNum(){
        num++
    }fun minusNum(){
        num--
    }fun resetNum(){
        num = 0
    }
}