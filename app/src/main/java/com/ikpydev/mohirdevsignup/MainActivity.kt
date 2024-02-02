package com.ikpydev.mohirdevsignup

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.androidx.AppNavigator
import com.ikpydev.mohirdevsignup.databinding.ActivityMainBinding
import com.ikpydev.mohirdevsignup.databinding.FragmentSignUpBinding
import org.koin.android.ext.android.inject

class MainActivity(
) : FragmentActivity() {

    private lateinit var binding: FragmentSignUpBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentSignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {
            val intent = Intent(this,EmailActivity::class.java)
            startActivity(intent)
        }
    }


}