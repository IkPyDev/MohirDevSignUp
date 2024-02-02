package com.ikpydev.mohirdevsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikpydev.mohirdevsignup.databinding.ActivityEmailBinding

class EmailActivity : AppCompatActivity() {
    private lateinit var binding :ActivityEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {
            val intent = Intent(this,PasswordActivity::class.java)
            startActivity(intent)
        }
    }
}