package com.twqe.hwday13

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageViewDelete=findViewById<ImageView>(R.id.imageViewDelete)


        imageViewDelete.setOnClickListener {
            var imageViewDelete=findViewById<ImageView>(R.id.imageViewDelete)
            var imageView=findViewById<ImageView>(R.id.imageView)
            var view=findViewById<View>(R.id.view2)
            var alertDialog= AlertDialog.Builder(this)
//            set Title
            alertDialog.setTitle("exit")
//         set message
            alertDialog.setMessage("Do you want to delete the item")
//            set positive btn
            alertDialog.setPositiveButton("Yes"){ dialog, which->
                view.isVisible=false
                imageViewDelete.isVisible=false
                imageView.isVisible=false
            }
//            set negative btn
            alertDialog.setNegativeButton("No"){ dialog, which ->
                dialog.cancel()
            }
            var exitDaialog = alertDialog.create()
            exitDaialog.show()
        }

        }
    }





