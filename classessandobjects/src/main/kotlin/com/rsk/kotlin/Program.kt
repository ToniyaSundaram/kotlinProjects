package com.rsk.kotlin

import com.rsk.Java.Person

class Program {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person()
             p.name ="Tonu"
            p.age=23
            p.partnerName="Kiara"

            try {
                p.name=""
            }catch (e: Exception) {
                println(e.message)
            }
            println("${p.age} years old ${p.partnerName} is with ${p.name} year old")
        }
    }

}

class Student:  Person()