package com.tcs.mvvmsample.mockedapi

import com.tcs.mvvmsample.model.User

class APIMock {

    companion object{
        fun login(user: User) : Boolean{
            return user.name == "Tata" && user.companyName == "TCS"

        }
    }



}