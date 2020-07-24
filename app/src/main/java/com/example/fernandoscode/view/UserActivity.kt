package com.example.fernandoscode.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.fernandoscode.R
import com.example.fernandoscode.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    private lateinit var userViewModel : UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        doLogin()

        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        userViewModel.msg.observe(this, Observer {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })

    }

    private fun doLogin() {
        button.setOnClickListener {

            userViewModel.configureMessage(edit_name.text.toString(), edit_company_name.text.toString())

        }
    }
}