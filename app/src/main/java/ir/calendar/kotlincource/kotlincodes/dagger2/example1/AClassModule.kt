package ir.calendar.kotlincource.kotlincodes.dagger2.example1

import dagger.Module
import dagger.Provides

@Module
class AClassModule {

    @Provides
    fun aClassProvider(b : BClass) : AClass {
        return AClass(b)
    }
}