package com.example.hw_week3_day3_solution

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

        //Objects
        var deleteImg = findViewById<ImageView>(R.id.deleteImg)
        var iconView = findViewById<ImageView>(R.id.deleteImg)
var layoutDelete = findViewById<LinearLayout>(R.id.layoutDelete)
        //Events
        deleteImg.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)

            //set Title
            alertDialog.setTitle("Delete item") //Localization

            //set Message
            alertDialog.setMessage("Do you want to delete the item?") //removed the hardcoded by selecting "Extract string Resources"

            //set a positive Button
            alertDialog.setPositiveButton("Yes"){ dialog, which->
                //finish()
                layoutDelete.isVisible= false

            }

            //set Negative Button
            alertDialog.setNegativeButton("No"){ dialog, which->
                dialog.cancel()
            }
            //create dialog
            var exitDialog = alertDialog.create()

            //show dialog
            exitDialog.show()
        }
    }
}