package ir.calendar.kotlincource.kotlincodes.dagger2.example2

import android.util.Log
import javax.inject.Inject

class Blocks @Inject constructor() {
    fun getBlocks() {
        Log.d("MyTag", "myBlocks")
    }
}