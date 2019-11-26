package ir.calendar.kotlincource.KotlinCodes.KotlinDagger2.example2

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    fun enableRemote(car : Car){
        Log.d("MyTag", "remote is connected...")
    }
}