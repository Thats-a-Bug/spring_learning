package com.thatsabug.lesson1to4

class HelloWorld {
    private var message: String = ""

    fun setMessage(message: String) {
        this.message = message
    }

    fun getMessage() {
        println("Your Message : $message")
    }
}