package com.enigma.exercise_fragment.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlayerViewModel :ViewModel(){
    var name : MutableLiveData<String> = MutableLiveData("")
    fun SetName(newName:String){

    }
}

