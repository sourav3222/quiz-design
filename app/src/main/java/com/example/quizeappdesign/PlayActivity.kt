package com.example.quizeappdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizeappdesign.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {
    lateinit var binding: ActivityPlayBinding

    val quizList = listOf<Quiz>(
        Quiz(
            "victory day of bangladesh?",
            "16 dec",
            "16 aug",
            "13 aug",
            "12 aug" ,
            "16 dec")
    )
    var  index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)
         initquestion()
    }

    fun initquestion() {

        val quiz = quizList[index]

        binding.apply {
            questionTV.text = quiz.question
            option1.text = quiz.option1
            option2.text = quiz.option2
            option3.text = quiz.option3
            option4.text = quiz.option4
        }

    }
}