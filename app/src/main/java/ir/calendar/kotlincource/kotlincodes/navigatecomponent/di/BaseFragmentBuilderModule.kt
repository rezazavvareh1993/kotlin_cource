package ir.calendar.kotlincource.kotlincodes.navigatecomponent.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ir.calendar.kotlincource.kotlincodes.navigatecomponent.DestFragment

@Module
abstract class BaseFragmentBuilderModule {

    @ContributesAndroidInjector(modules = [BaseFragmentModule::class])
    abstract fun bindFirstFragment(): DestFragment
}