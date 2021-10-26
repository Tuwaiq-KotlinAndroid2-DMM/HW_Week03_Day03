package com.example.week3day3hw

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

        var LayoutParent=findViewById<LinearLayout>(R.id.LayoutParent)
        var imageViewClose=findViewById<ImageView>(R.id.imageViewClose)

        imageViewClose.setOnClickListener {

            var alertAialog = AlertDialog.Builder(this)
            alertAialog.setTitle("Delete picture")
            alertAialog.setMessage("Are you sure ?")
            alertAialog.setNegativeButton("NO"){dialog,which ->
                dialog.cancel()
            }
            alertAialog.setPositiveButton("YES"){ dialog,which ->

                LayoutParent.isVisible=false

            }



            var deleeteDialog = alertAialog.create()
            deleeteDialog.show()
        }
    }
}