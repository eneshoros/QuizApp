package com.example.quizapp.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R
import com.example.quizapp.utils.Constants

class QuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val questionsList=Constants.getQuestions()
        Log.d("QuestionSize","${questionsList.size}")
    }
}