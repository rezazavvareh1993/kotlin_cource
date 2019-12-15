package ir.calendar.kotlincource.kotlincodes.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {
    private val nameList = ArrayList<String>()
    private val mutableLiveData = MutableLiveData<List<String>>()

    fun  addname(name : String ){
        nameList.add(name)
        mutableLiveData.value = nameList
    }

    fun getNames () = mutableLiveData

}