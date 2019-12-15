package ir.calendar.kotlincource.kotlincodes.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.calendar.kotlincource.R
import kotlinx.android.synthetic.main.activity_test_mvvm.*

class TestMVVMActivity : AppCompatActivity() {


    lateinit var adapter : TestMVVMAdapter
    val list = ArrayList<String>()
    lateinit var viewModel  : TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvvm)

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(TestViewModel::class.java)
        viewModel.getNames().observe(this, Observer {
            list.clear()
            list.addAll(it)
            adapter.notifyDataSetChanged()
        })

        adapter = TestMVVMAdapter(list)

        mvvm_recyclerview.adapter = adapter
        mvvm_recyclerview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        btn_test_mvvm.setOnClickListener {
            val name = edt_test_mvvm_.text.toString()
            viewModel.addname(name)
            edt_test_mvvm_.setText("")
        }
    }
}
