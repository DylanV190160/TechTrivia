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
            "answer 2",
                "answer 3",
                "answer 4"

        )

        val que2 = Question(
            2,
            "question 2",
            R.drawable.ic_logo,
            "answer 1",
            "answer 2",
                "answer 3",
                "answer 4"
        )

        val que3 = Question(
            3,
            "question 3",
            R.drawable.ic_logo,
            "answer 1",
            "answer 2",
                "answer 3",
                "answer 4"
        )


        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)

        return questionsList
    }

    // TECHNOLOGY DEVICES QUESTION LIST

    fun getTechQuestions(): ArrayList<Question>{
        //List of questions to be returned
        val techQuestionsList = ArrayList<Question>()

        val techQue1 = Question(
                1,
                "question1",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2",
                "answer 3",
                "answer 4"
        )

        val techQue2 = Question(
                2,
                "question 2",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2",
                "answer 3",
                "answer 4"
        )

        val techQue3 = Question(
                3,
                "question 3",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2",
                "answer 3",
                "answer 4"
        )

        techQuestionsList.add(techQue1)
        techQuestionsList.add(techQue2)
        techQuestionsList.add(techQue3)

        return techQuestionsList
    }

    // PEOPLE IN TECH QUESTION LIST

    fun getPeopleQuestions(): ArrayList<Question>{
        //List of questions to be returned
        val peopleQuestionsList = ArrayList<Question>()

        val peopleQue1 = Question(
                1,
                "Who is the current CEO of Microsoft Corporation?",
                R.drawable.ic_logo,
                "Bill Murray",
                "Bill Nye",
                "Satya Nadella",
                "Bill Gates"
        )

        val peopleQue2 = Question(
                2,
                "Who was the first programmer?",
                R.drawable.ic_logo,
                "Ada Lovelace",
                "Mark Zuckerberg",
                "Alan Turing",
                "Tim Berners-Lee"
        )

        val peopleQue3 = Question(
                3,
                "Who invented the Printing Press?",
                R.drawable.ic_logo,
                "Martin Cooper",
                "Johannes Gutenberg",
                "Nikola Tesla",
                "Albert Einstein"
        )

        peopleQuestionsList.add(peopleQue1)
        peopleQuestionsList.add(peopleQue2)
        peopleQuestionsList.add(peopleQue3)

        return peopleQuestionsList
    }

    // TERMINOLOGY QUESTION LIST

    fun getTerminologyQuestions(): ArrayList<Question>{
        //List of questions to be returned
        val terminologyQuestionsList = ArrayList<Question>()

        val termQue1 = Question(
                1,
                "What does LAN stand for?",
                R.drawable.ic_logo,
                "Local Artist Network",
                "Local Area Net",
                "Local Area Network",
                "Local Aerial Network"
        )

        val termQue2 = Question(
                2,
                "question 2",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2",
                "answer 3",
                "answer 4"
        )

        val termQue3 = Question(
                3,
                "question 3",
                R.drawable.ic_logo,
                "answer 1",
                "answer 2",
                "answer 3",
                "answer 4"
        )

        terminologyQuestionsList.add(termQue1)
        terminologyQuestionsList.add(termQue2)
        terminologyQuestionsList.add(termQue3)

        return terminologyQuestionsList
    }
}