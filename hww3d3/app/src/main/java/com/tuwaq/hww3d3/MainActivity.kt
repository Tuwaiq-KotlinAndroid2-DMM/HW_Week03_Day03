package com.tuwaq.hww3d3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View.X
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var layout = findViewById<LinearLayout>(R.id.layoutPerent)
        var x = findViewById<ImageView>(R.id.imageViewFalse)


        x.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)

            alertDialog.setTitle(getString(R.string.title))

            alertDialog.setMessage(getString(R.string.masseg))
            alertDialog.setPositiveButton(getString(R.string.yes)) { dialog, which ->
                layout.isVisible= false
            }
            alertDialog.setNegativeButton(getString(R.string.no)) { dialog, which ->
                dialog.cancel()


            }
            alertDialog.show()
        }
    }
}
