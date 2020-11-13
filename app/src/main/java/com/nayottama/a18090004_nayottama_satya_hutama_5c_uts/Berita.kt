package com.nayottama.a18090004_nayottama_satya_hutama_5c_uts

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.berita_list.*
import kotlin.random.Random

class Berita : AppCompatActivity() {
    private val listBerita = generateDummyList(500)
    private val adapter = card_layout(listBerita)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.berita_list)
        supportActionBar?.apply {
            title = "Berita"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun generateDummyList(size: Int): ArrayList<itemLayout> {

        val list = ArrayList<itemLayout>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.kejagung
                else -> R.drawable.kejagung
            }
            val item = itemLayout(drawable, "Item $i", "Line 2")
            list += item
        }

        return list
    }
}