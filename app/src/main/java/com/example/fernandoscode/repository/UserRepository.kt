package com.example.fernandoscode.repository

import com.example.fernandoscode.model.User

class UserRepository {

    fun login(user: User) : Boolean{

        return APIMock.login(user)

    }

}