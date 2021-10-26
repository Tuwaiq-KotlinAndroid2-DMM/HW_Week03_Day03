package com.example.hw_w3_day3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageViewX = findViewById<ImageView>(R.id.imageViewX)
        var layout = findViewById<ViewGroup>(R.id.LinearLayout)
//        var
        imageViewX.setOnClickListener {

            var alertDialog = AlertDialog.Builder(this)

            alertDialog.setTitle("Delete Item")

            alertDialog.setMessage("Do you want to delete the item?")
            alertDialog.setPositiveButton("Yes"){ dialog, which ->
                layout.isVisible = false
            }
            alertDialog.setNegativeButton("No"){ dialog, which ->
                dialog.cancel()
            }

            var deleteDialog = alertDialog.create()

            deleteDialog.show()
        }
    }
}