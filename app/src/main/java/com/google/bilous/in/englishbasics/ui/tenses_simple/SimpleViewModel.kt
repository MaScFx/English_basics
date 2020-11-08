package com.google.bilous.`in`.englishbasics.ui.tenses_simple

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SimpleViewModel: ViewModel() {
    val text = MutableLiveData<String>().apply {
        value = "This is Simple Fragment"
    }
//    val text: LiveData<String> = _text
}