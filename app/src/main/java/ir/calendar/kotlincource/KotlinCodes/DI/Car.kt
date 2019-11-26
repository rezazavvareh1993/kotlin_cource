package ir.calendar.kotlincource.KotlinCodes.DI

class Car(private val engine: Engine) {

    fun start() {
        engine.start()
    }
}
