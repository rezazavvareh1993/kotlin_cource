package ir.calendar.kotlincource.kotlincodes.mvp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.calendar.kotlincource.R
import kotlinx.android.synthetic.main.activity_mvp_test.*

class TestMVPActivity : AppCompatActivity(), TestMVPContract.View {


    lateinit var adapter: TestMVPAdapter
    val list = ArrayList<String>()
    lateinit var  presenter : TestMVPContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp_test)

        presenter = TestPresenter(this)
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")
        list.add("Ali")


        mvp_test_btn.setOnClickListener {
            presenter.getAllName()
        }

        setUpRecyclerView(list)
//        presenter.getAllName()

    }

    override fun setUpRecyclerView(names : List<String>) {
        adapter = TestMVPAdapter(list) {
            showToast(it)
        }
        mvp_test_my_recyclerview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        mvp_test_my_recyclerview.adapter = adapter
    }

    override fun onNameReceived(namesList : List<String>){
        list.addAll(namesList)
        adapter.notifyDataSetChanged()
    }

    override fun showToast(it: String) {
        Toast.makeText(this, it , Toast.LENGTH_LONG ).show()
    }

}