package ir.calendar.kotlincource.kotlincodes.mvp

import android.util.Log
import io.reactivex.Observable

class TestModel(private val presenter : TestMVPContract.Presenter) {

    fun fetchAllName() {
         Observable.just(arrayListOf("qoli", "Reza", "mammad"))
            .subscribe({
                presenter.onNameReceived(it)
            }, {
                Log.d("myLog", it.message)
            })
    }
}