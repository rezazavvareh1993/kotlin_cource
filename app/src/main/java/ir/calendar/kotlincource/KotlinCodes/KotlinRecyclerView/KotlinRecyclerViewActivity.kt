package ir.calendar.kotlincource.KotlinCodes.KotlinRecyclerView

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ir.calendar.kotlincource.R
import kotlinx.android.synthetic.main.activity_main.*

class KotlinRecyclerViewActivity : AppCompatActivity() {
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

        my_recyclerview.adapter =
            KotlinRecyclerViewAdapter(list) {
                showToast(it)
            }
    }
    fun showToast(name : String){
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }
}