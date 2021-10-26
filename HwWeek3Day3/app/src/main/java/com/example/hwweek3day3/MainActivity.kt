package com.example.hwweek3day3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonCancel = findViewById<Button>(R.id.buttonCancel)
        var ParentLayout = findViewById<LinearLayout>(R.id.ParentLayout)

        buttonCancel.setOnClickListener {

            var alertDialog = AlertDialog.Builder(this)

            alertDialog.setTitle(getString(R.string.Title))
            alertDialog.setMessage(getString(R.string.Message))

            alertDialog.setPositiveButton("Yes"){dialog , which ->

                ParentLayout.isInvisible= true
            }
            alertDialog.setNegativeButton("No"){dialog , which ->

                dialog.cancel()
            }

            var Dialog = alertDialog.create()
            Dialog.show()
        }



    }
}