package com.example.dagger_hilt_di

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject  constructor( @Named("activityMString")val activityString:String): ViewModel() {
    init {
        Log.d("viewModelString", "$activityString: ")
    }
}