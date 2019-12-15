package ir.calendar.kotlincource.kotlincodes.dagger2.example1

import javax.inject.Inject

class BClass @Inject constructor(val c : CClass) {
    fun goToC(){
        c.show()
    }
}