package com.thatsabug.lesson1to4.triangle

import org.springframework.beans.factory.BeanNameAware
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware

class Point : BeanNameAware, ApplicationContextAware {
    private lateinit var id: String
    private lateinit var name: String
    private lateinit var x: String

    private lateinit var y: String

    fun setX(x: String) {
        this.x = x
    }

    fun setY(y: String) {
        this.y = y
    }

    override fun toString() = "$x,$y"
    override fun setApplicationContext(context: ApplicationContext) {
        this.id = context.id!!
    }

    override fun setBeanName(name: String) {
        this.name = name
    }

    fun getBeanName() = name
    fun getId() = id

}