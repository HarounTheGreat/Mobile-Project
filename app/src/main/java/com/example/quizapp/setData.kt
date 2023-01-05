package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "How do you insert COMMENTS in Kotlin code?",

           "-- This is a comment",
           "# This is a comment",
           "/* This is a comment",
           "// This is a comment",
           4
       )
       var question2 = QuestionData(
           2,
           "Which keyword is used to declare a function?",

           "fun",
           "decl",
           "define",
           "function",
           1
       )
       var question3 = QuestionData(
           3,
           "How can you create a variable with the numeric value 5?",

           "num = 5 int",
           "val num = 5",
           "num = 5",
           "int num = 5",
           2
       )
       var question4 = QuestionData(
           4,
           "How can you create a variable with the floating number 2.8?",

           "num = 2.8 float",
           "double num = 2.8",
           "val num = 2.8",
           "float num = 2.8",
           3
       )

       var question5 = QuestionData(
           5,
           "Which operator is used to add together two values?",

           "The * sign",
           "The ADD keyword",
           "The & sign",
           "The + sign",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}