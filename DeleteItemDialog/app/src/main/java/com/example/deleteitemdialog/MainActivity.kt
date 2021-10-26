package com.example.deleteitemdialog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isInvisible
import android.text.Layout as Layout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Link component
        var deletingImg = findViewById<ImageView>(R.id.imageViewDelete)
        var parentLayout = findViewById<LinearLayout>(R.id.parentLayout)

        //Add onClickListener on DeletingImg
        deletingImg.setOnClickListener {
            //Define alert dialog
            var alertDialog = AlertDialog.Builder(this)

            //set dialog's part
            alertDialog.setTitle(getString(R.string.alertTitle))
            alertDialog.setMessage(getString(R.string.alertMessage))

            //Confirm button
            alertDialog.setPositiveButton(getString(R.string.yes)){ dialog, which->
                parentLayout.isInvisible=true
            }

            //Cancel button
            alertDialog.setNegativeButton(getString(R.string.no)){ dialog, which ->
                dialog.dismiss()
            }

            //Showing the dialog
            alertDialog.show()
        }

    }



}