package com.example.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toaster.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.show(this, "Hii")
    }
}