package ir.calendar.kotlincource.kotlincodes.navigatecomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation

import ir.calendar.kotlincource.R


class StepOneFragment : Fragment() , View.OnClickListener{

    lateinit var navController: NavController
    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        name = arguments!!.getString("name")

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_step_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.button_step_one).setOnClickListener(this)
        view.findViewById<TextView>(R.id.textView_step_one).text = name

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_step_one -> navController.navigate(R.id.action_stepOneFragment_to_stepTwoFragment2)
        }
    }


}