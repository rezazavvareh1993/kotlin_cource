package ir.calendar.kotlincource.KotlinCodes.KotlinDagger2.example1

import android.util.Log
import android.widget.Toast
import javax.inject.Inject

class CClass @Inject constructor() {
    fun show(){
        Log.d("MyTag", "I am in CClass")
    }
}