package com.tcs.mvvmsample.repository

import com.tcs.mvvmsample.mockedapi.APIMock
import com.tcs.mvvmsample.model.User

class UserRepository {

    fun login(user: User): Boolean {

        return APIMock.login(user)

    }

}