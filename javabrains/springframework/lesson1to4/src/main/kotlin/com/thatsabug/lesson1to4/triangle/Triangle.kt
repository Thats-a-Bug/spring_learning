package com.thatsabug.lesson1to4.triangle

class Triangle {

    private lateinit var pointA: Point
    private lateinit var pointB: Point
    private lateinit var pointC: Point

    fun setPointA(pointA: Point) {
        this.pointA = pointA
    }

    fun setPointB(pointB: Point) {
        this.pointB = pointB
    }

    fun setPointC(pointC: Point) {
        this.pointC = pointC
    }

    fun getCoordinates() =
            "PointA: $pointA, Point B: $pointB, Point C: $pointC"
}