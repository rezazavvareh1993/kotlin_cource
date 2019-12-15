package ir.calendar.kotlincource.kotlincodes.navigatecomponent


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import dagger.android.support.DaggerFragment
import ir.calendar.kotlincource.kotlincodes.navigatecomponent.di.SampleFirstFragmentDependency

import ir.calendar.kotlincource.R
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 */
class DestFragment : DaggerFragment() ,View.OnClickListener{

    @Inject
    lateinit var sample : SampleFirstFragmentDependency

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dest, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
//        view.findViewById<Button>(R.id.button_dest).setOnClickListener(this)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("daggerTest" , sample.string())

    }

    override fun onClick(v: View?) {
        when(v?.id){
//            R.id.button_dest -> {
//                if(!TextUtils.isEmpty(editText_dest.text.toString())){
//                    val bundle = bundleOf("name" to editText_dest.text.toString())
//                    navController!!.navigate(
//                        R.id.action_destFragment_to_stepOneFragment,
//                        bundle
//                    )
//                }
//                else{
//                    Toast.makeText(activity, "Enter a name", Toast.LENGTH_SHORT).show()
//                }
//
//
//            }
        }
    }


}
