package com.example.w3h3

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
        var imageViewdeleted = findViewById<ImageView>(R.id.imageView)
        var lout = findViewById<LinearLayout>(R.id.lout)
        imageViewdeleted.setOnClickListener {

            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle(getString(R.string.titel))

            alertDialog.setMessage(getString(R.string.message))

            alertDialog.setPositiveButton(getString(R.string.yes)) { dialog, which ->

                lout.isVisible = false
            }
            alertDialog.setNegativeButton(getString(R.string.no)) { dialog, which ->
                dialog.cancel()
            }
            alertDialog.show()
        }
    }
}
