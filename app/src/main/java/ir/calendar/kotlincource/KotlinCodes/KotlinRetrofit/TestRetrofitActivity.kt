package ir.calendar.kotlincource.KotlinCodes.KotlinRetrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import ir.calendar.kotlincource.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class TestRetrofitActivity : AppCompatActivity() {

    val disposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_retrofit)

       RetrofitProviderClass.providerRetrofit().getData()
           .enqueue(object : Callback<Repo>{
               override fun onFailure(call: Call<Repo>, t: Throwable) {
                   Toast.makeText(this@TestRetrofitActivity, "Failed : ${t.message}", Toast.LENGTH_LONG).show()
               }

               override fun onResponse(call: Call<Repo>, response: Response<Repo>) {
                   Toast.makeText(this@TestRetrofitActivity, "Success: ${response.body()?.tooltips?.loading}", Toast.LENGTH_LONG).show()
               }
           })

        //retrofit by Rx and Observable
        disposable.add(RetrofitProviderClass.providerRetrofit()
            .getDataRx()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Toast.makeText(this@TestRetrofitActivity, "Success: ${it.tooltips.loading}", Toast.LENGTH_LONG).show()
            },{
                Toast.makeText(this@TestRetrofitActivity, "Failed : ${it.message}", Toast.LENGTH_LONG).show()
            }))
    }

    override fun onDestroy() {
        super.onDestroy()
        disposable.clear()
    }
}
