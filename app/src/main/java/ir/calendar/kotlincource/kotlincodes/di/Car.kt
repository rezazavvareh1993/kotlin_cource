package ir.calendar.kotlincource.kotlincodes.di

class Car(private val engine: Engine) {

    fun start() {
        engine.start()
    }
}
