package ir.calendar.kotlincource.kotlincodes.recyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ir.calendar.kotlincource.R
import kotlinx.android.synthetic.main.activity_navigation.*

class KotlinRecyclerViewActivity : AppCompatActivity() {

//    @Inject
    lateinit var adapter : KotlinRecyclerViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        my_recyclerview.layoutManager = LinearLayoutManager(this)

        val list = ArrayList<String>()
        list.add("reza")
        list.add("reza")
        list.add("reza")
        list.add("reza")
        list.add("reza")
        list.add("reza")

//        val component = DaggerRecyclerComponent.create()

    }
    fun showToast(name : String){
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }
}