package com.example.myapplicationhwwen


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.view.get
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import java.lang.System.exit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var close =findViewById<ImageView>(R.id.imageView3)
        var viewlayout=findViewById<LinearLayout>(R.id.ParentLayout)

        close.setOnClickListener {
            var alerDialog=AlertDialog.Builder(this)

            alerDialog.setTitle(getString(R.string.Exit))

            alerDialog.setMessage("Do you want to delete")

            alerDialog.setPositiveButton(getString(R.string.y)){ // because it is a button it needs a listener


                    dialog, which ->

                viewlayout.isVisible=false

            }


            alerDialog.setNegativeButton(getString(R.string.n)){
                    dialog,which ->
                // we call the whole dialog for the NO option
                dialog.cancel()
            }

            var exitDialog=alerDialog.create()

            // show dialog

            exitDialog.show()



        }

    }
}
