package com.olsc.ohmlawsimplecircle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.olsc.ohmlawsimplecircle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lawView.setOnClickListener(){
            

            binding.answerI.text = "I="+(binding.enterU.text.toString().toDouble()/(binding.enterRSmall.text.toString().toDouble() + binding.enterRBig.text.toString().toDouble())).toString()
        }
    }
}