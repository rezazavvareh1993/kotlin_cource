package ir.calendar.kotlincource.KotlinCodes.KotlinDagger2.example1

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AClassModule {

    @Provides
    fun aClassProvider(b : BClass) : AClass {
        return AClass(b)

    }
}