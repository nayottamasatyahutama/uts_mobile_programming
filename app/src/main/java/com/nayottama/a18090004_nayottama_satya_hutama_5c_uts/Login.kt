package com.nayottama.a18090004_nayottama_satya_hutama_5c_uts

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Login : AppCompatActivity() {
    var userName: EditText? = null
    var passWord: EditText? = null
    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        userName = findViewById<View>(R.id.userName) as EditText
        passWord = findViewById<View>(R.id.passWord) as EditText
        preferences = getSharedPreferences(Login.Companion.KEYPREF, MODE_PRIVATE)

        if (preferences.contains(KEYUSERNAME) && preferences.contains(KEYPASSWORD)) {
            userName!!.setText(preferences.getString(Login.Companion.KEYUSERNAME, ""))
            passWord!!.setText(preferences.getString(Login.Companion.KEYPASSWORD, ""))
        }
    }

    fun loginAkun(view: View?) {
        val user = userName!!.text.toString()
        val pass = passWord!!.text.toString()
        val editor = preferences!!.edit()
        editor.putString(KEYUSERNAME, user)
        editor.putString(KEYPASSWORD, pass)
        editor.apply()
        Toast.makeText(this, "UserName dan Password disimpan", Toast.LENGTH_SHORT).show()
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun exit(view: View?) {
        System.exit(0)
    }

    companion object {
        const val KEYPREF = "Key Preferences"
        const val KEYUSERNAME = "Key Username"
        const val KEYPASSWORD = "Key Password"
    }
}