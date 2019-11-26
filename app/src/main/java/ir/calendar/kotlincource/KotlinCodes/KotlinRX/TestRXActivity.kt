package ir.calendar.kotlincource.KotlinCodes.KotlinRX

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.jakewharton.rxbinding2.widget.RxTextView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import ir.calendar.kotlincource.R
import kotlinx.android.synthetic.main.activity_test_rx.*
import java.util.concurrent.TimeUnit

class TestRXActivity : AppCompatActivity() {
    val disposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_rx)

        disposable.add(
            RxTextView
                .textChanges(test_rx_edt)
                .filter { it.length > 3 }
                .debounce(2, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Toast.makeText(this, it, Toast.LENGTH_LONG).show()
                }, {
                    Log.d("MyTag", it.message)
                })
        )

        val testClass = TestObservableClass()

        disposable.add(
           testClass.getNumbers()
                .subscribe({
                    println(it)
                },
                    {
                        Log.d("MyTag", it.message)
                    })
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        disposable.clear()
    }
}
