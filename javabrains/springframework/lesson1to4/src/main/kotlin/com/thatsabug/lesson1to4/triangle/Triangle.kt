package com.thatsabug.lesson1to4.triangle

class Triangle {

    private var pointA: String = ""
    private var pointB: String = ""
    private var pointC: String = ""

    fun setPointA(pointA: String) {
        this.pointA = pointA
    }

    fun setPointB(pointB: String) {
        this.pointB = pointB
    }

    fun setPointC(pointC: String) {
        this.pointC = pointC
    }

    fun getCoordinates() =
            "PointA: $pointA, Point B: $pointB, Point C: $pointC"
}