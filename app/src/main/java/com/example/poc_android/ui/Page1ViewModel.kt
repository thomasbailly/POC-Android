package com.example.poc_android.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Page1ViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Page1 Fragment"
    }
    val text: LiveData<String> = _text
}