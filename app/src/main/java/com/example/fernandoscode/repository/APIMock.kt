package com.example.fernandoscode.repository

import com.example.fernandoscode.model.User

class APIMock {

    companion object{
        fun login(user: User) : Boolean{

            return user.name == "Tata" && user.companyName == "TCS"

        }
    }



}