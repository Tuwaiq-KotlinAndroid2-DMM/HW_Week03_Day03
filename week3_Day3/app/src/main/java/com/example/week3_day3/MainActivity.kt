package com.example.week3_day3

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var delete = findViewById<ImageView>(R.id.imageViewDelete)
        var linear= findViewById<LinearLayout>(R.id.linearLayout)

        delete.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)

            //set Title
            alertDialog.setTitle(getString(R.string.Delete))

            //set Message
            alertDialog.setMessage(getString(R.string.Dialog_Massage))

            //set Positive btn
            alertDialog.setPositiveButton(getString(R.string.Yes)){ dialog, which ->
                 linear.isInvisible=true
            }

            //set Negative btn
            alertDialog.setNegativeButton(getString(R.string.No)){ dialog, which ->
                dialog.cancel()
            }

            //create dialog
            var exitDialog = alertDialog.create()

            //show dialog
            exitDialog.show()

        }

    }
}