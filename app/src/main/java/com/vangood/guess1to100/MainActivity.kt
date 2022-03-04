package com.vangood.guess1to100

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.vangood.guess1to100.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val SecretNum = SecretNumber()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun main(){
        println("Please enter a number between ${SecretNum.min} to ${SecretNum.max} ")
    }

    fun guess(view:View){
        SecretNum.num = binding.edNum.text.toString().toInt()
        println(SecretNum.count)
        if (SecretNum.count <= SecretNum.limit) {
            SecretNum.count++
            if (SecretNum.num > SecretNum.secret) {
                SecretNum.max = SecretNum.num
                binding.tvMax.text = SecretNum.max.toString()
                println("Please enter a number between ${SecretNum.min} to ${SecretNum.max} ")
            } else {
                if (SecretNum.num < SecretNum.secret) {
                    SecretNum.min = SecretNum.num
                    binding.tvMin.text = SecretNum.min.toString()
                    println("Please enter a number between ${SecretNum.min} to ${SecretNum.max} ")
                } else {
                    println("You got it, the secret number is ${SecretNum.num}")
                }
            }
        } else {
            println("Exceeded times, hahaha loser!! ")
        }
    }

}