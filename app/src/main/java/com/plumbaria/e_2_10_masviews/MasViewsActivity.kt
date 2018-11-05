package com.plumbaria.e_2_10_masviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MasViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mas_views)
    }

    fun sePulsa(view:View){
        Toast.makeText(this,"Pulsado",Toast.LENGTH_SHORT).show()
    }
}