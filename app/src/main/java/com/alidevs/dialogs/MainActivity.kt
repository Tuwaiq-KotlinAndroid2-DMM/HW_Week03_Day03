package com.alidevs.dialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val closeImageView = findViewById<ImageView>(R.id.closeImageView)
		val layout = findViewById<ConstraintLayout>(R.id.mainLayout)

		closeImageView.setOnClickListener {
			val alertDialog = AlertDialog
				.Builder(this)
				.setTitle("Delete item")
				.setMessage("Are you sure you want to delete the item?")

			alertDialog.setPositiveButton("Yes") { _, _ ->
	           layout.removeAllViews()
			}

			alertDialog.setNegativeButton("No") { dialog, _ ->
				dialog.cancel()
			}

			alertDialog.create().show()
		}
	}
}