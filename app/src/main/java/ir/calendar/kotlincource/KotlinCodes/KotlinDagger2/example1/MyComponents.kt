package ir.calendar.kotlincource.KotlinCodes.KotlinDagger2.example1

import dagger.Component
import ir.calendar.kotlincource.KotlinCodes.KotlinDagger2.example1.AClass
import ir.calendar.kotlincource.KotlinCodes.KotlinDagger2.example1.AClassModule

@Component(modules = [AClassModule::class])
interface MyComponents {

    fun getAClass (): AClass
}