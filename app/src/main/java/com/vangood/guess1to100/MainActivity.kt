package com.vangood.guess1to100

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.vangood.guess1to100.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val SecretNumber = SecretNumber()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        println("Please enter a number between ${SecretNumber.min} to ${SecretNumber.max} ")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvMin.text = "1"
        binding.tvMax.text = "100"
    }

    fun main(){
//        println("Please enter a number between ${SecretNum.min} to ${SecretNum.max} ")
    }

    fun guess(view:View){
        SecretNumber.num = binding.edNum.text.toString().toInt()
//        println(SecretNum.count)
//        println(SecretNum.secret)
        if (SecretNumber.count <= SecretNumber.limit) {
            SecretNumber.count++
            if (SecretNumber.num > SecretNumber.secret) {
                SecretNumber.max = SecretNumber.num
                binding.tvMax.text = SecretNumber.max.toString()
                SecretNumber.check()
            } else {
                if (SecretNumber.num < SecretNumber.secret) {
                    SecretNumber.min = SecretNumber.num
                    binding.tvMin.text = SecretNumber.min.toString()
                    SecretNumber.check()
                } else {
                    println("You got it, the secret number is ${SecretNumber.num}")
                }
            }
        } else {
            SecretNumber.check()
        }

    }

}