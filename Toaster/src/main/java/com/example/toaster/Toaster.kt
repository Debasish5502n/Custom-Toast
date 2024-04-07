package com.example.toaster

import android.content.Context
import android.widget.Toast

class Toaster {

    companion object{
        fun show(context: Context, msg: String){
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}