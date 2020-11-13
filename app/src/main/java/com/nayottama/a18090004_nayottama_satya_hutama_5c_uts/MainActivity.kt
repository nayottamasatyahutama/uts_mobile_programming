package com.nayottama.a18090004_nayottama_satya_hutama_5c_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn_calc: Button
    private lateinit var btn_exit: Button
    private lateinit var btn_profile: Button
    private lateinit var btn_berita: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        btn_calc = findViewById(R.id.btn_calc)
        btn_exit = findViewById(R.id.btn_exit)
        btn_profile = findViewById(R.id.btn_profil)
        btn_berita = findViewById(R.id.btn_berita)
        btn_calc.setOnClickListener() {
            intent = Intent(this, Kalkulator::class.java)
            startActivity(intent)
        }
        btn_profile.setOnClickListener() {
            intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        btn_berita.setOnClickListener() {
            intent = Intent(this, Berita::class.java)
            startActivity(intent)
        }
        btn_exit.setOnClickListener {
            exit()
        }
    }
    fun exit() {
        System.exit(0)
    }
}