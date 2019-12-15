package ir.calendar.kotlincource.kotlincodes.dagger2.example1

import android.util.Log
import javax.inject.Inject

class CClass @Inject constructor() {

    fun show(){
        Log.d("MyTag", "I am in CClass")
    }
}