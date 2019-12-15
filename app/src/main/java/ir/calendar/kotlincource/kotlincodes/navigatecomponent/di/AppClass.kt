package ir.calendar.kotlincource.kotlincodes.navigatecomponent.di

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class AppClass :
    DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent
            .factory()
            .create(this)

}