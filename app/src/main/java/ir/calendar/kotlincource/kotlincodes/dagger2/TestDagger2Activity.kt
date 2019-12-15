package ir.calendar.kotlincource.kotlincodes.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.calendar.kotlincource.kotlincodes.dagger2.example1.DaggerMyComponents
import ir.calendar.kotlincource.kotlincodes.dagger2.example2.Car
import ir.calendar.kotlincource.kotlincodes.dagger2.example2.DaggerCarComponents
import ir.calendar.kotlincource.R
import javax.inject.Inject

class TestDagger2Activity : AppCompatActivity() {

    /////FieldInjection
    @Inject
    lateinit var  car2 : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_dagger2)
//        val c = CClass()
//        val b = BClass(c)
//        val a = AClass(b)

        val a = DaggerMyComponents.create().getAClass()

        val components = DaggerCarComponents.create()

        /////////////Dagger2 but we still created instance from car class in here
        val car1 = components.getCar()
        car1.drive()

        //////////////////Dagger2 whit FieldInjection
        components.getTestDagger2Activity(this)
        car2.drive()


    }
}
