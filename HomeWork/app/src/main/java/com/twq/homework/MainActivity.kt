package com.twq.homework

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

        // get image close and layout
        var imgViewClose = findViewById<ImageView>(R.id.imageViewClose)
        var layout = findViewById<LinearLayout>(R.id.layoutContainer)




        // on click of x we get dialog

        imgViewClose.setOnClickListener{
            // define dialog builder
            var closeDialogAlert = AlertDialog.Builder(this)

            // set title for dialog
            closeDialogAlert.setTitle(getString(R.string.mess))
            // set message
            closeDialogAlert.setMessage(getString(R.string.message))

            //set positiveBtn
            closeDialogAlert.setPositiveButton(getString(R.string.yes)){ dialog, which ->
                layout.isVisible = false
            }

            // set negative btn
            closeDialogAlert.setNegativeButton(getString(R.string.no)){ dialog, which ->

                dialog.cancel()

            }

            closeDialogAlert.show()


        }
    }
}