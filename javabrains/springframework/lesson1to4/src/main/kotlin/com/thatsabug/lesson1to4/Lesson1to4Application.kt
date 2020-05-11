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
	`print triangle`(context)
	`print polygon`(context)
	`verify prototype triangle`(context)
}

fun `verify prototype triangle`(context: ClassPathXmlApplicationContext) {
	val triangle1 = context.getBean("trianglePrototype") as Triangle
	val triangle2 = context.getBean("trianglePrototype") as Triangle
	check(triangle1 != triangle2)

	val triangle3 = context.getBean("triangle") as Triangle
	val triangle4 = context.getBean("triangle") as Triangle
	check(triangle3 == triangle4)

}

fun `print polygon`(context: ClassPathXmlApplicationContext) {
	val obj = context.getBean("polygon") as Polygon
	println(obj)
}

fun `print triangle`(context: ClassPathXmlApplicationContext) {
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
