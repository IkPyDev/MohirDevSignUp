package com.ikpydev.mohirdevsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikpydev.mohirdevsignup.databinding.ActivityPaswordBinding

class PasswordActivity : AppCompatActivity() {

    private lateinit var binding:ActivityPaswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {
            val intent = Intent(this,OtpActivity::class.java)
            startActivity(intent)
        }
    }
}