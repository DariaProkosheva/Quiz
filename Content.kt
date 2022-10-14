package com.example.firstquiz

object Content {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Укажи слово, в котором допущена ошибка",
            "окрестность", "прелесный",
            "капустный", "радостный", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Самостоятельная часть речи, которая с другими словами пишется раздельно и служит для связи слов в предложении и словосочетании.",
            "числительное", "приставка",
            "глагол", "предлог", 4
        )

        questionsList.add(que2)

        return questionsList
    }
}