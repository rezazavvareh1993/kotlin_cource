package ir.calendar.kotlincource.KotlinCodes.KotlinRetrofit

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {

    @GET("HPImageArchive.aspx?format=js&idx=0&n=1&mkt=en-Us")
    fun getData() : Call<Repo>

    @GET("HPImageArchive.aspx?format=js&idx=0&n=1&mkt=en-Us")
    fun getDataRx() : Observable<Repo>

}