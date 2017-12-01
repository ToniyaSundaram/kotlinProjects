package com.sample

interface Signatory {
    fun sign()
}

class Person (val name:String, var age: Int): Signatory {
    override fun sign() = println("$name aged $age can override your signature")
}



fun main(args: Array<String>) {
    val p = Person("Toniya",18)
    p.sign()
    p.age = 20
    p.sign()

}