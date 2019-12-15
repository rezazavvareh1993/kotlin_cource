package ir.calendar.kotlincource.kotlincodes.navigatecomponent.di

import dagger.Module
import dagger.Provides

@Module
object BaseActivityModule {

    @JvmStatic
    @Provides
    fun provideSampleClass() =
        SampleCommonDependency(
            8
        )
}