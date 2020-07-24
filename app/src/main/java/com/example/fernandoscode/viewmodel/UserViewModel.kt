package com.example.fernandoscode.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fernandoscode.model.User
import com.example.fernandoscode.repository.UserRepository

class UserViewModel : ViewModel() {

    private val repository = UserRepository()

    private var mutableMsg = MutableLiveData<String>()

    var msg : LiveData<String> = mutableMsg

    fun configureMessage(name: String, companyName: String){

        val user = User(name, companyName)

        if(areFieldsValid(user)){

            var result = repository.login(user)

            if(result){
                mutableMsg.value = "${user.name}, Login MVVM success"
            } else {
                mutableMsg.value = "${user.name}, Login MVVM failure"
            }

        }

    }

    fun areFieldsValid(user: User) : Boolean{

        return user.name.isNotEmpty() && user.companyName.isNotEmpty()

    }

}