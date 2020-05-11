package com.thatsabug.lesson1to4.triangle

class Polygon (private val type: String) {

    private lateinit var points: List<Point>

    fun setPoints(points: List<Point>) {
        this.points = points
    }

    override fun toString() =
        points.fold("Type: $type |") {
            acc, point -> "$acc, $point"
        }
}