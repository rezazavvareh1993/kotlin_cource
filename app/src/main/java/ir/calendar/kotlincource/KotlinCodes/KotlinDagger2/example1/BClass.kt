package ir.calendar.kotlincource.KotlinCodes.KotlinDagger2.example1

import javax.inject.Inject

class BClass @Inject constructor(val c : CClass) {
    fun goToC(){
        c.show()
    }
}