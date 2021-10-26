package com.example.week3day3homework

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

        var ImageViewRemove = findViewById<ImageView>(R.id.ImageViewRemove)
        var layoutAmar = findViewById<LinearLayout>(R.id.layout)
        ImageViewRemove.setOnClickListener {



        var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Remove Item")

            alertDialog.setMessage("Do you wish to delete the item?")

            alertDialog.setPositiveButton("yes") { dialog, which ->

                layoutAmar.isVisible = false
            }
            alertDialog.setNegativeButton("No") { dialog, which ->
                dialog.cancel()
            }
            alertDialog.show()
        }
    }
}


