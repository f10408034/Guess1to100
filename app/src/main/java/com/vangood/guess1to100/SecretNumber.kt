package com.vangood.guess1to100

class SecretNumber{
    val secret = (2..99).random()
    var max = 100
    var min = 1
    val limit = 5
    var count = 0
    var num = 0
}