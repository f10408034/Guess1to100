package com.vangood.guess1to100

class SecretNumber{
    val secret = (2..99).random()
    var max = 100
    var min = 1
    val limit = 5
    var count = 1
    var num = 0

    fun check(){
        if (count <= limit){
            println("Please enter a number between ${min} to ${max} ")
        } else {
            println("Exceeded times, hahaha loser!!")
        }
    }
}
