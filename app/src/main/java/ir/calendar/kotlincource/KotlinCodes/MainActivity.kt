package ir.calendar.kotlincource.KotlinCodes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import ir.calendar.kotlincource.KotlinCodes.KotlinRecyclerView.KotlinRecyclerViewAdapter
import ir.calendar.kotlincource.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
