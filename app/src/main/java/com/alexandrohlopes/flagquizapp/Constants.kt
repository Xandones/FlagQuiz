package com.alexandrohlopes.flagquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions() : ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belongs to",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Brazil",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belongs to",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Brazil",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belongs to",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Australia",
            "Armenia",
            "Belgium",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belongs to",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Australia",
            "Armenia",
            "Brazil",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belongs to",
            R.drawable.ic_flag_of_denmark,
            "Argentina",
            "Australia",
            "Armenia",
            "Denmark",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belongs to",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Australia",
            "Armenia",
            "Brazil",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belongs to",
            R.drawable.ic_flag_of_germany,
            "Argentina",
            "Australia",
            "Germany",
            "Brazil",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belongs to",
            R.drawable.ic_flag_of_india,
            "India",
            "Australia",
            "Armenia",
            "Brazil",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belongs to",
            R.drawable.ic_flag_of_kuwait,
            "Argentina",
            "Australia",
            "Kuwait",
            "Brazil",
            3
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belongs to",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "Australia",
            "Armenia",
            "Brazil",
            1
        )
        questionsList.add(que10)

        return questionsList
    }
}