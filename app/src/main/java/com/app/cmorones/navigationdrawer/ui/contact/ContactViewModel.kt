package com.app.cmorones.navigationdrawer.ui.contact

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Cesar Morones"
    }

    private val _correo = MutableLiveData<String>().apply {
        value = "app.cmorones@gmail.com"
    }

    private val _address = MutableLiveData<String>().apply {
        value = "Gabriel Mancera 1142"
    }

    val text: LiveData<String> = _text
    val correo: LiveData<String> = _correo
    val direccion: LiveData<String> = _address

}