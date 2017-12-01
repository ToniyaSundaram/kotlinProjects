package com.sample

interface Signatory {
    fun sign()
}

class Person : Signatory {
    override fun sign() = println("I can override your signature")
}

fun main(args: Array<String>) {
    val p = Person()
    p.sign()
}