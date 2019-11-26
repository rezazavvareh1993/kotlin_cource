package ir.calendar.kotlincource.KotlinCodes.KotlinRX

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TestObservableClass {

    fun getNumbers() : Observable<Int>{
        return Observable.just(1,2,3,4)
            .map { it * it  }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}