package com.example.quizeappdesign

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizeappdesign.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

      val skip =   intent.getIntExtra("skip",0)
       val carrect =  intent.getIntExtra("carrect",0)
       val worng =  intent.getIntExtra("worng",0)


        binding.resltTv.text = "skip : $skip\n"+ "carrect: $carrect\n"+"worng: $worng"
    }
}