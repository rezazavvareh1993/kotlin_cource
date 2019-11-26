package ir.calendar.kotlincource.KotlinCodes.KotlinDagger2.example2

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(val blocks: Blocks, val cylanders: Cylanders) {
    fun start(){
        Log.d("MyTag", "Engine is started")
        blocks.getBlocks()
    }
}