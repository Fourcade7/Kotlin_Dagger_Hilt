package com.pr.kotlin_dagger_hilt

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class TestViewModel @ViewModelInject constructor():ViewModel() {

    init {
        Log.d("PR7", "viewmodel injected:... ")
    }

    @Inject
    fun prviewmodel(){
        Log.d("PR7", "prviewmodel injected:... ")
    }
}