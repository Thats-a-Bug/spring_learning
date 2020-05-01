package com.thatsabug.lesson1to4

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext


fun main() {
	val context: ApplicationContext = ClassPathXmlApplicationContext("x.xml")
	val obj = context.getBean("helloWorld") as HelloWorld
	obj.getMessage()
}
