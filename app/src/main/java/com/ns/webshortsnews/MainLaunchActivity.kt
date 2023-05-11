package com.ns.webshortsnews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ns.webshortsnews.databinding.ActivityMainLaunchBinding
import com.ns.webshortsnews.databinding.ActivityWebBinding

class MainLaunchActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainLaunchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainLaunchBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.pagerButton.setOnClickListener {
            val intent = Intent(this@MainLaunchActivity, MainActivity::class.java)
            intent.putExtra("count","All")
            startActivity(intent)
        }


        binding.webViewButton.setOnClickListener {
            val intent = Intent(this@MainLaunchActivity, MainActivity::class.java)
            intent.putExtra("count","one")
            startActivity(intent)
        }
    }
}