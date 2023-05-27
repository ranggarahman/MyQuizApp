package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "Uruguay", "Brazil",
            1
        )

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Norway", "Finland",
            "Denmark", "Italy",
            3
        )


        questionsList.add(que1)
        questionsList.add(que2)

        return  questionsList
    }
}