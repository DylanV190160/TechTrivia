package com.example.techtrivia

data class Question(
    val id: Int,
    val question: String,
    val icon: Int,
    val optionOne: String,
    val optionTwo: String
)