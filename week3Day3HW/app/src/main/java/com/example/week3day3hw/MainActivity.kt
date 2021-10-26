package com.example.week3day3hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var view=findViewById<View>(R.id.view)
        var imageViewDel=findViewById<ImageView>(R.id.imageViewDelete)
        var imageViewPic=findViewById<ImageView>(R.id.imageViewPicture)

        imageViewDel.setOnClickListener {
            var view=findViewById<View>(R.id.view)
            var imageViewDel=findViewById<ImageView>(R.id.imageViewDelete)
            var imageViewPic=findViewById<ImageView>(R.id.imageViewPicture)
            var alertDialog = AlertDialog.Builder(this)

            alertDialog.setTitle("Delete Item")


            alertDialog.setMessage("Do you want to delete the item")
            alertDialog.setPositiveButton("yes"){dialog,which->
                view.isVisible=false
                imageViewPic.isVisible=false
                imageViewDel.isVisible=false

            }
            alertDialog.setNegativeButton("No") { dialog, wish ->
                dialog.cancel()
            }
            var exitDaialog = alertDialog.create()
            exitDaialog.show()
        }
    }
}