package com.icanerdogan.basicdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.icanerdogan.basicdatabinding.databinding.ActivityMainBinding
import com.icanerdogan.basicdatabinding.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        user = User("İbrahim Can", 21, false, "https://avatars.githubusercontent.com/u/52867508?v=4")

        binding.uservariable = user

    }
}