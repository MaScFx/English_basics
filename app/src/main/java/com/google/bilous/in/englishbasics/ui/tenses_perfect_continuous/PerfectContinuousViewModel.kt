package com.google.bilous.`in`.englishbasics.ui.tenses_perfect_continuous

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PerfectContinuousViewModel: ViewModel() {
     val text = MutableLiveData<String>().apply {
        value = "Perfetc Cont. VM"
    }

}