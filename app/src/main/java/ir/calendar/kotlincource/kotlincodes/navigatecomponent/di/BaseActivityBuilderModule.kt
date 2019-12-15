package ir.calendar.kotlincource.kotlincodes.navigatecomponent.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ir.calendar.kotlincource.kotlincodes.navigatecomponent.MainActivity

@Module
abstract class BaseActivityBuilderModule {

    @ContributesAndroidInjector(modules = [BaseActivityModule::class, BaseFragmentBuilderModule::class])
    abstract fun bindMainActivity(): MainActivity
}