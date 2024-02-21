package com.example.hw_6_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _counterLv = MutableLiveData<Int>()
    val counterLv:LiveData<Int> = _counterLv

    fun inc(){
        Model.inc()
        _counterLv.value =Model.count
    }

    fun dec(){
        Model.dec()
        _counterLv.value = Model.count
    }

}