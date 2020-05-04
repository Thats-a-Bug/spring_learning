package com.thatsabug.lesson1to4.helloworld

class HelloWorld {
    private var message: String = ""

    fun setMessage(message: String) {
        this.message = message
    }

    fun getMessage() = "Your Message : $message"
}