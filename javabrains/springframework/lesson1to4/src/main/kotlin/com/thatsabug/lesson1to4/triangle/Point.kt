package com.thatsabug.lesson1to4.triangle

class Point {
    private lateinit var x: String

    private lateinit var y: String

    fun setX(x: String) {
        this.x = x
    }

    fun setY(y: String) {
        this.y = y
    }

    override fun toString() = "$x,$y"
}