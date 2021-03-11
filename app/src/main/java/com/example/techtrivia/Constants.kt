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

        val que4 = Question(
                4,
                "question 3",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2"
        )

        val que5 = Question(
                5,
                "question 3",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2"
        )

        val que6 = Question(
                6,
                "question 3",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2"
        )

        val que7 = Question(
                7,
                "question 3",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2"
        )

        val que8 = Question(
                8,
                "question 3",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2"
        )

        val que9 = Question(
                9,
                "question 3",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2"
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)

        return questionsList
    }
}