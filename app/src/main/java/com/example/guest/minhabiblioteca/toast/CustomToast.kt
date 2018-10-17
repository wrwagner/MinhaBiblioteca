package com.example.guest.minhabiblioteca.toast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import com.example.guest.minhabiblioteca.R


class CustomToast(val context: Context, val inflater: LayoutInflater) {

    fun showToast(text: String) {
        val customToastroot = inflater.inflate(R.layout.custom_layout, null)
        val customtoast = Toast(context)

        val textView = customToastroot.findViewById<TextView>(R.id.textView1)
        textView.text = text

        customtoast.view = customToastroot
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customtoast.duration = Toast.LENGTH_LONG

        customtoast.show()
    }

}