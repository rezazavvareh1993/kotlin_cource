package ir.calendar.kotlincource.kotlincodes.mvp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ir.calendar.kotlincource.R
import kotlinx.android.synthetic.main.itm_recyclerview.view.*

class TestMVPAdapter(val list : List<String>, val activityFunction : (String) -> Unit) : RecyclerView.Adapter<TestMVPAdapter.myViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itm_recyclerview, parent, false)
        return myViewHolder(
            v,
            activityFunction
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.Bind(list[position])
    }

    class myViewHolder(itemView: View , val activityFunction : (String) -> Unit) : RecyclerView.ViewHolder(itemView){
        fun Bind (title : String){
            itemView.tv_title.text = title
            itemView.setOnClickListener {
                activityFunction(title)
            }
        }
    }

}