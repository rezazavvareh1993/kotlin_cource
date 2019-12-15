package ir.calendar.kotlincource.kotlincodes.navigatecomponent

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import ir.calendar.kotlincource.kotlincodes.navigatecomponent.di.SampleCommonDependency
import ir.calendar.kotlincource.R
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(){

    @Inject
    lateinit var sampleClass: SampleCommonDependency


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d("MyTag", sampleClass.number())
    }
}
