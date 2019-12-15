package ir.calendar.kotlincource.kotlincodes.dagger2.example2

import dagger.Component
import ir.calendar.kotlincource.kotlincodes.dagger2.TestDagger2Activity

@Component(modules = [CarModule::class])
//@Component
interface CarComponents {

    fun getCar() : Car

    fun getTestDagger2Activity(testDagger2Activity : TestDagger2Activity)
}