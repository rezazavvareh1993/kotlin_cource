package ir.calendar.kotlincource.kotlincodes.dagger2.example1

import dagger.Component


@Component(modules = [AClassModule::class])
interface MyComponents {

    fun getAClass (): AClass
}