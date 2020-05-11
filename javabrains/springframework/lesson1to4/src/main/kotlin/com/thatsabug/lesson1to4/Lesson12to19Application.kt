package com.thatsabug.lesson1to4

import com.thatsabug.lesson1to4.triangle.Point
import com.thatsabug.lesson1to4.triangle.Triangle
import org.springframework.context.support.ClassPathXmlApplicationContext


private fun main() {
	val context = `get context`("triangle.xml")
	`mutate triangle`(context)
	`print point id and bean name`(context)
}

fun `print point id and bean name`(context: ClassPathXmlApplicationContext) {
	val pointC = getPoint(context, "pointC")
	println(pointC.getId())
	println(pointC.getBeanName())
	val context = `get context`("triangle.xml")
	val pointC2 = getPoint(context, "pointC")
	println(pointC2.getId())
	println(pointC.getBeanName())
	check(pointC != pointC2)
}

private fun `mutate triangle`(context: ClassPathXmlApplicationContext) {
	val triangle1 = `get triangle`(context)
	val triangle2 = `get triangle`(context)
	println(triangle1.getCoordinates())
	triangle2.setPointA(getPoint(context, "pointB"))
	println(triangle1.getCoordinates())
}

fun getPoint(context: ClassPathXmlApplicationContext, point: String) =
		context.getBean(point) as Point

fun `get triangle`(context: ClassPathXmlApplicationContext) =
		context.getBean("triangle") as Triangle

private fun `get context`(file: String) = ClassPathXmlApplicationContext(file)
