package com.example.techtrivia

object Constants {
    const val USER_NAME : String = "userName"
    const val WRONG_ANSWERS : String = "wrongAnswers"
    const val CORRECT_ANSWERS_PEOPLE : String = "correctAnswersPeople"
    const val CORRECT_ANSWERS_DEVICE : String = "correctAnswersDevice"
    const val CORRECT_ANSWERS_TERMS : String = "correctAnswersTerms"

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
                "What does RAM stand for?",
                R.drawable.ic_logo,
                "Ready Always Memory",
                "Random All Memories",
                "Read Access Memory",
                "Random Access Memory"
        )

        val termQue3 = Question(
                3,
                "What does URL stand for?",
                R.drawable.ic_logo,
                "Unknown Resources Location",
                "Unified Resource Locator",
                "Unique Resource Locator",
                "Unique Resource Level"
        )

        terminologyQuestionsList.add(termQue1)
        terminologyQuestionsList.add(termQue2)
        terminologyQuestionsList.add(termQue3)

        return terminologyQuestionsList
    }

    // TECHNOLOGY DEVICES QUESTION LIST
    fun getDeviceQuestions(): ArrayList<Question>{
        //List of questions to be returned
        val deviceQuestionsList = ArrayList<Question>()

        val deviceQue1 = Question(
                1,
                "Which was the first supercomputer?",
                R.drawable.ic_logo,
                "CDC 6600",
                "Cray-1",
                "IBM 7030 Stretch",
                "UNIVAC"
        )

        val deviceQue2 = Question(
                2,
                "Which year was the first Macintosh computer released?",
                R.drawable.ic_logo,
                "1984",
                "1904",
                "1990",
                "1995"
        )

        val deviceQue3 = Question(
                3,
                "Which devices is used to connect to the internet?",
                R.drawable.ic_logo,
                "Black box",
                "Modem",
                "USB Dongle",
                "Wifi Antenna"
        )

        deviceQuestionsList.add(deviceQue1)
        deviceQuestionsList.add(deviceQue2)
        deviceQuestionsList.add(deviceQue3)

        return deviceQuestionsList
    }
}