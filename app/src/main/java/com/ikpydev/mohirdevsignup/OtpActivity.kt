package com.ikpydev.mohirdevsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikpydev.mohirdevsignup.databinding.ActivityOtpBinding
import kotlin.system.exitProcess

class OtpActivity : AppCompatActivity() {
    private lateinit var  binding:ActivityOtpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {

        }
    }
}