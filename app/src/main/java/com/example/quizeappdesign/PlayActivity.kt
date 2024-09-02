package com.example.quizeappdesign

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.quizeappdesign.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {
    lateinit var binding: ActivityPlayBinding

    var updateQuestion = 1
    val quizList = listOf<Quiz>(
        Quiz("victory day of Bangladesh", "15 september", "13 october", "16 December","18 january","16 December"),


        Quiz("How many minutes are in a full work", "12,211 minutes", "10,210 minutes", "10,311 minutes","10,080 minutes","10,080 minutes"),
        Quiz("Aureolin is shape of what a color?","Green","Yellow","Red","White","Yellow"),

        Quiz("What software company is headquatered in redmoned, whasington?","mycrosoft","google","facebook","jaba","mycrosoft"),
        Quiz("How many dots appear on a pair of dice?","32","31","52","42","42"),
        Quiz("What is acrophobia a fear of?","Height","Weight","age","name","Height"),
        Quiz(" What phone company produced the 3310? ","  Nokia","ViVo","MIUI","Readme","Nokia")
    )
    var  index = 0
    var Finished = false
    var skip = -1
    var carrect = 0
    var worng  = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)
         initquestion()
        binding.nextbtn.setOnClickListener{
            showNextQuestion()
        }

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

    } private fun showNextQuestion(){
        carrectAnsware()
        binding.apply {

            if (updateQuestion < quizList.size ){
                updateQuestion++
                initquestion()
            }else if (index <= quizList.size -1){
                index++
            }else{
                Finished = true
            }

            rediogroup.clearCheck()

        }
    }


    fun carrectAnsware() {

        binding.apply {
            if (rediogroup.checkedRadioButtonId == -1){
                skip++

            }else{
                var checkButton = findViewById<RadioButton>(rediogroup.checkedRadioButtonId)
                var checkAnswer = checkButton.text.toString()

                if (checkAnswer == quizList[index].Answer){
                    carrect++
                    alartdialog("Carrect Answer")
                }else{
                    worng++
                    alartdialog("Worng Answer")
                }
            }
            if (index <= quizList.size -1){
                index++

            }else{
                alartdialog("Finished")
            }

        }


    }
    fun alartdialog(massage: String){
        val builder = AlertDialog.Builder(this)

        builder.setTitle(massage)

        builder.setPositiveButton("Successfully ",object : DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {

            }


        })
        var alart = builder.create()
        alart.show()


    }


}