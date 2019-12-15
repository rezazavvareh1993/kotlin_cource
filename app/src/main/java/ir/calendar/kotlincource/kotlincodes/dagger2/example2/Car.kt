package ir.calendar.kotlincource.kotlincodes.dagger2.example2

import android.util.Log
import javax.inject.Inject


class Car (val engine : Engine , val wheels: Wheels){

    val TAG = "MyTag"

    init {
        engine.start()
    }

    @Inject
    fun setRemote(remote: Remote){
        remote.enableRemote(this)
    }

    fun drive(){
      Log.d(TAG, "im driving")
        }
}