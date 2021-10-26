package com.login.hw_w3_d3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var linearLayout= findViewById<LinearLayout>(R.id.linearlayout)
        var imageViewclose= findViewById<ImageView>(R.id.imageViewClose)

        imageViewclose.setOnClickListener {
            var alertDialog= AlertDialog.Builder(this)
            alertDialog.setTitle("Masage")

            alertDialog.setMessage("do you want to deleted")
            alertDialog.setPositiveButton("yes"){ x,y ->
                linearLayout.isVisible=false


                }
                alertDialog.setNegativeButton("no"){x,y ->
                    x.cancel()

                }

                   var x=  alertDialog.create()
            x.show()
        }



    }
}