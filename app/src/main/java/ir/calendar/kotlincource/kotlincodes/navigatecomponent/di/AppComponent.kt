package ir.calendar.kotlincource.kotlincodes.navigatecomponent.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules =
    [AndroidInjectionModule::class,
        BaseActivityBuilderModule::class]
)
interface AppComponent :
    AndroidInjector<AppClass> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}