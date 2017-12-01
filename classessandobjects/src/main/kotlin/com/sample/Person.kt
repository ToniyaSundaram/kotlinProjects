package com.sample

interface Signatory {
    fun sign()
}

open class Person (val name:String, var age: Int): Signatory {

    var patnername: String = ""
    override fun sign() = println("$name aged $age can override your signature $isMarried")
    var isMarried= false
    constructor(name:String, age:Int,isMarried:Boolean): this(name,age) {
        this.isMarried=isMarried
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val p = Person("Toniya",18,true)
            // p.sign()
            p.patnername = "Deepu"
            println("My friend's name is ${p.patnername}")

            p.patnername = "Pappu"
            println("My friend's name is ${p.patnername}")


            p.age = 20
            p.sign()

        }
    }
}



fun main(args: Array<String>) {
    val p = Person("Toniya",18,true)
   // p.sign()
    p.age = 20
    p.sign()

}