package com.pr.kotlin_dagger_hilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor():ViewModel() {

    init {
        Log.d("PR7", "viewmodel injected:... ")
    }

    @Inject
    fun prviewmodel(){
        Log.d("PR7", "prviewmodel injected:... ")
    }
}