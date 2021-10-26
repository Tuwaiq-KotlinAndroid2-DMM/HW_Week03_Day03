package com.twq.hw3

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

            var imagedelete=findViewById<ImageView>(R.id.imageView3)
            var imagedelete2=findViewById<ImageView>(R.id.imageView4)

        var deleteLyout=findViewById<LinearLayout>(R.id.horizontalDelete)

        imagedelete.setOnClickListener {
            var alartDialog=AlertDialog.Builder(this)
            alartDialog.setTitle(getString(R.string.DeleteItem))
            alartDialog.setMessage(getString(R.string.massage))
            alartDialog.setPositiveButton("yes"){dialog,which->

                deleteLyout.isVisible=false
                            }
            alartDialog.setNegativeButton("No"){dialog,which->
                dialog.cancel()
            }
            var exitDialog = alartDialog.create()


            exitDialog.show()
        }


    }
}