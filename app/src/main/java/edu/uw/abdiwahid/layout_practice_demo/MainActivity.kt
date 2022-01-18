package edu.uw.abdiwahid.layout_practice_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private  val TAG = "MAIN_ACTIVITY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main  )

        Log.v(TAG, "${R.layout.activity_main}")

       // val view: View = findViewById<View>(R.)
        val button: Button = findViewById<Button>(R.id.btn_greeting)

        button.text = ("Dynamic Text! HAHAHAAH")

        //val R.string.app_name = "Layout Demo"
//        class R {
//            object string {
//                const val app_name = "My Application"
//                const val greeting = "Hello Android!"
//            }
//        }
     //   findViewById<>()
    }
}