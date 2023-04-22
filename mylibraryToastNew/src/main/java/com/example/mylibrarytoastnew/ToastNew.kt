package com.example.mylibrarytoastnew

import android.content.Context
import android.widget.Toast

object ToastNew {
    fun showToast(context:Context,msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}