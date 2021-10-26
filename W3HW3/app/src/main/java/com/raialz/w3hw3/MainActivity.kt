package com.raialz.w3hw3

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

        var imageViewB = findViewById<ImageView>(R.id.imageViewB)
        var layoutC = findViewById<LinearLayout>(R.id.layoutC)
        imageViewB.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Delete Item")
            alertDialog.setMessage("Do you want to delete the item?")
            alertDialog.setPositiveButton("yes") { dialog, which ->
                layoutC.isVisible = false
            }
            alertDialog.setNegativeButton("No") { dialog, which ->
                dialog.cancel()
            }
            alertDialog.show()
        }
    }
}











