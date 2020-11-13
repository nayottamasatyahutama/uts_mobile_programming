package com.nayottama.a18090004_nayottama_satya_hutama_5c_uts

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Kalkulator : AppCompatActivity() {
    var e1: EditText? = null
    var e2: EditText? = null
    var t1: TextView? = null
    var num1 = 0
    var num2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)
        supportActionBar?.apply {
            title = "Kalkulator"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    val numbers: Boolean
        get() {
            e1 = findViewById<View>(R.id.edtnum1) as EditText
            e2 = findViewById<View>(R.id.edtnum2) as EditText
            t1 = findViewById<View>(R.id.txthasil) as TextView

            var s1 = e1!!.text.toString()
            var s2 = e2!!.text.toString()

            if (s1.equals(null) && s2.equals(null)
                || s1.equals("") && s2.equals("")
            ) {
                val result = "Please enter a value"
                t1!!.text = result
                return false
            } else {
                num1 = e1!!.text.toString().toInt()

                num2 = e2!!.text.toString().toInt()
            }
            return true
        }

    fun tambah(v: View?) {
        if (numbers) {
            val sum = num1 + num2
            t1!!.text = Integer.toString(sum)
        }
    }

    fun kurang(v: View?) {
        if (numbers) {
            val sum = num1 - num2
            t1!!.text = Integer.toString(sum)
        }
    }

    fun kali(v: View?) {
        if (numbers) {
            val sum = num1 * num2
            t1!!.text = Integer.toString(sum)
        }
    }
    fun bagi(v: View?) {
        if (numbers) {
            val sum = num1 / (num2 * 1.0)
            t1!!.text = java.lang.Double.toString(sum)
        }
    }

}