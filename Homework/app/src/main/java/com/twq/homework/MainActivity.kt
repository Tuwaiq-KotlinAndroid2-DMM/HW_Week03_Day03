package com.twq.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonDelete = findViewById<ImageView>(R.id.buttonDelete)
        var img = findViewById<ImageView>(R.id.imageView)
        var layout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.layoutHorizontal)


        buttonDelete.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)

            alertDialog.setTitle(getString(R.string.deleteTitle))
            alertDialog.setMessage(getString(R.string.body))
            alertDialog.setPositiveButton(getString(R.string.yes)){ dialog, which ->
                img.isInvisible = true
                layout.isInvisible = true
        }
            alertDialog.setNegativeButton("No"){dialog, which ->
                dialog.cancel()
            }
            var exitDialog = alertDialog.create()
            exitDialog.show()
        }
    }
}