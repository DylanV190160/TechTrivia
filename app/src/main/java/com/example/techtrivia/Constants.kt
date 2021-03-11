package com.example.techtrivia

object Constants {
    const val USER_NAME : String = "username"
    const val WRONG_ANSWERS : String = "wrongAnswers"

    fun getQuestions(): ArrayList<Question>{
        //List of questions to be returned
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "question 1",
            R.drawable.ic_logo,
            "answer 1",
            "answer 2"
        )

        val que2 = Question(
            2,
            "question 2",
            R.drawable.ic_logo,
            "answer 1",
            "answer 2"
        )

        val que3 = Question(
            3,
            "question 3",
            R.drawable.ic_logo,
            "answer 1",
            "answer 2"
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)

        return questionsList
    }
}