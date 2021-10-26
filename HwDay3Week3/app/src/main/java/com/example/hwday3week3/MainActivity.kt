package com.example.hwday3week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imgX = findViewById<ImageView>(R.id.imageViewX)

        var layout = findViewById<LinearLayout>(R.id.layout)
        imgX.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Delete item")
            alertDialog.setMessage("Do you want to delete the item?")
            alertDialog.setPositiveButton(getString(R.string.yes)){ dialog, which ->
                layout.isVisible = false
            }
            alertDialog.setNegativeButton(getString(R.string.No)){ dialog,which ->
                dialog.cancel()
            }
            var exitDialog = alertDialog.create()
            exitDialog.show()

        }
    }
}