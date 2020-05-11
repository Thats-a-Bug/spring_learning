package com.thatsabug.lesson1to4

import com.thatsabug.lesson1to4.helloworld.HelloWorld
import com.thatsabug.lesson1to4.triangle.Polygon
import com.thatsabug.lesson1to4.triangle.Triangle
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext


fun main() {
	`say hello world`()
	`print the triangle`()
}

fun `print the triangle`() {
	val context = `get context`("triangle.xml")
	printTriangle(context)
	printPolygon(context)
}

fun printPolygon(context: ClassPathXmlApplicationContext) {
	val obj = context.getBean("polygon") as Polygon
	println(obj)
}

private fun printTriangle(context: ClassPathXmlApplicationContext) {
	val obj = context.getBean("triangle") as Triangle
	println(obj.getCoordinates())
	println(obj.getType())
}

private fun `say hello world`() {
	val context = `get context`("spring.xml")
	val obj = context.getBean("helloWorld") as HelloWorld
	println(obj.getMessage())
}

private fun `get context`(file: String) = ClassPathXmlApplicationContext(file)
