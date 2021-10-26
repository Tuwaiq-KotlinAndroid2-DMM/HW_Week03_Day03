package com.example.hw_week03_day03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var linearItemList = findViewById<LinearLayout>(R.id.linearLayourItems)
        var imgClose = findViewById<ImageView>(R.id.imageViewClose)
        var imgIcon = findViewById<ImageView>(R.id.imageViewIcon)

        imgClose.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setIcon(R.drawable.ic_baseline_close_24)
            alertDialog.setTitle(getString(R.string.title_en))
            alertDialog.setMessage(getString(R.string.message_en))
            alertDialog.setPositiveButton(getString(R.string.positive_en)) { dialog, btnID ->
                linearItemList.isVisible = false
            }
            alertDialog.setNegativeButton(getString(R.string.negative_en)) { dialog, btnID ->
                dialog.dismiss()
            }

            alertDialog.show()
        }
    }
}