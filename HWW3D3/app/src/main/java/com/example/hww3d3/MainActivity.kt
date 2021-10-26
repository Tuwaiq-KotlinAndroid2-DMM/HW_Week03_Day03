package com.example.hww3d3

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
        var imageView=findViewById<ImageView>(R.id.imageView)
        var imageview2=findViewById<ImageView>(R.id.imageView2)
      var  liner=findViewById<LinearLayout>(R.id.liner)
        imageView.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Delete Item")
            alertDialog.setMessage(getString(R.string.MASSAGE))
            alertDialog.setPositiveButton("YES") { dialog, which ->
liner.isVisible=false
            }
            alertDialog.setNegativeButton("NO") { dialog, which ->
                dialog.cancel()

            }
            var exitdialog = alertDialog.create()
            exitdialog.show()

        }
        }
    }
