package ir.calendar.kotlincource.kotlincodes.dagger2.example2

import dagger.Module
import dagger.Provides

@Module
class CarModule {

    @Provides
    fun provideCarClass(engine: Engine, wheels: Wheels) : Car{
        return Car(engine, wheels)
    }
}