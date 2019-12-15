package ir.calendar.kotlincource.kotlincodes.FireBase.DataBase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.*
import ir.calendar.kotlincource.R
import kotlinx.android.synthetic.main.activity_fire_base.*

class FireBaseActivity : AppCompatActivity() {

    val rootRef = FirebaseDatabase.getInstance().reference
    var resultRef = rootRef.child("result")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fire_base)

        resultRef.addValueEventListener(object : ValueEventListener{
            override fun onCancelled(p0: DatabaseError) {

            }

            override fun onDataChange(p0: DataSnapshot) {
                var result = p0.getValue(String::class.java)
                txt_result_fire_base.text = result
            }

        })

        btn_x_fire_base.setOnClickListener {
            resultRef.setValue("XX")
        }

        btn_y_fire_base.setOnClickListener {
            resultRef.setValue("YY")
        }
    }


    }
