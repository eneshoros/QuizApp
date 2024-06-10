package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants {
    fun getQuestions(): MutableList<Question> {
        val questions = mutableListOf<Question>()
        val quest1 = Question(
            1, "What country does this flag belong?",
            R.drawable.FlagItaly, "Italy", "Bulgaria", "Austria", "Ivory Coast", 1
        )
        questions.add(quest1)

        val quest2 = Question(
            2, "What country does this flag belong?",
            R.drawable.FlagArgentina, "Belize", "Argentina", "Kenya", "Luxembourg", 2
        )
        questions.add(quest2)

        val quest3 = Question(
            3, "What country does this flag belong?",
            R.drawable.FlagBrazil, "Turkey", "Ethiopia", "Pakistan", "Brazil", 4
        )
        questions.add(quest3)

        val quest4 = Question(
            4, "What country does this flag belong?",
            R.drawable.FlagSpain, "Zimbabwe", "Ukraine", "Spain", "Bahrain", 3
        )
        questions.add(quest4)

        val quest5 = Question(
            5, "What country does this flag belong?",
            R.drawable.FlagFrance, "Germany", "France", "Belgium", "Netherlands", 2
        )
        questions.add(quest5)

        val quest6 = Question(
            6, "What country does this flag belong?",
            R.drawable.FlagTurkey, "Turkey", "Belgium", "Sri Lanka", "Norway", 1
        )
        questions.add(quest6)

        val quest7 = Question(
            7, "What country does this flag belong?",
            R.drawable.FlagGermany, "Belgium", "Netherlands", "Austria", "Germany", 4
        )
        questions.add(quest7)

        val quest8 = Question(
            8, "What country does this flag belong?",
            R.drawable.FlagEngland, "Malta", "Estonia", "United Kingdom", "Moldova", 3
        )
        questions.add(quest8)

        return questions
    }
}