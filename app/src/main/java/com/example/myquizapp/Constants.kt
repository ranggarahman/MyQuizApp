package com.example.myquizapp

object Constants {

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