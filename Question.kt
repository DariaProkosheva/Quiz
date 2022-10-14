package com.example.firstquiz

data class Question(val id: Int,
                    val question: String,
                    val anOne: String,
                    val anTwo: String,
                    val anThree: String,
                    val anFour: String,
                    val rightAnswer: Int
)