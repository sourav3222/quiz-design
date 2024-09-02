package com.example.quizeappdesign

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizeappdesign.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {
    lateinit var binding: ActivityPlayBinding

    val quizList = listOf<Quiz>(
        Quiz(
            "victory day of bangladesh"
            "12 jan"
            "13 jan"
            "16 dec"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}