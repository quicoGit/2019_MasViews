package com.plumbaria.e_2_10_masviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_mas_views.*


class MasViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mas_views)
    }

    fun sePulsa(v: View){
        if (!TextUtils.isEmpty(entrada.getText()) && TextUtils.isDigitsOnly(entrada.getText())) {
            salida.setText(((entrada.text.toString()).toFloat() * 2.0).toString());
        }
    }
    fun sePulsa0(v: View){
        entrada.setText(entrada.text.toString() + v.getTag());
    }

}