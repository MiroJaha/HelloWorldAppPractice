package com.example.helloworldapppractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    fun suming(num1:Float,num2:Float):Float{
        return num1+num2
    }

    fun multipling(num1:Float,num2:Float):Float{
        return num1*num2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name="Miro"

        println("Hello $name")

        val n1=15.6f
        val n2=16.4f

        if(name.equals("Miro",true))
            println("The Sum of: $n1+$n2 = ${suming(n1,n2)}")

        println("The multiple of: $n1*$n2 = ${multipling(n1,n2)}")

    }
}