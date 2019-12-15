package ir.calendar.kotlincource.kotlincodes.navigatecomponent.di

import dagger.Module
import dagger.Provides

@Module
object BaseFragmentModule {
    @JvmStatic
    @Provides
    fun provideSampleDependency() =
        SampleFirstFragmentDependency(
            "start"
        )
}