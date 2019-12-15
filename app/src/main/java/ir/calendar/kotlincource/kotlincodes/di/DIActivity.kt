package ir.calendar.kotlincource.kotlincodes.di

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.calendar.kotlincource.R


class DIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val engine = Engine()
        val car = Car(engine)
        car.start()
    }
}