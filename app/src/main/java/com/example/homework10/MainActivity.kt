package com.example.homework10

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


        var imageViewX = findViewById<ImageView>(R.id.imageViewX)
        var layout=findViewById<LinearLayout>(R.id.layoutsY)

        imageViewX.setOnClickListener {
            var alertDialog= AlertDialog.Builder(this)

            alertDialog.setTitle("Delate")
            alertDialog.setMessage("Do you want Dealet  ?")

            alertDialog.setPositiveButton("Yes"){dialog , which -> layout.isVisible=false }
            alertDialog.setNegativeButton("No"){dialog , which -> dialog.cancel() }
            alertDialog.setNeutralButton("Cancel"){dialog , which -> dialog.cancel() }

            var exitdialog=alertDialog.create()
            exitdialog.show()

        }
    }
}  