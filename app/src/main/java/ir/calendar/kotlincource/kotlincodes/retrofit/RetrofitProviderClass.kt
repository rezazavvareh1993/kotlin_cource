package ir.calendar.kotlincource.kotlincodes.retrofit

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitProviderClass {

    companion object {

        fun providerRetrofit() : RetrofitInterface{
            val retrofit = Retrofit.Builder()
                .baseUrl("https://www.bing.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

            return retrofit.create(RetrofitInterface::class.java)
        }

    }


}