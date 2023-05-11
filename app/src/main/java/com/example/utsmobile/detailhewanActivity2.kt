package com.example.utsmobile

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detailhewanActivity2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailhewan2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val hewan = intent.getParcelableExtra<hewan>(MainActivity.INTENT_PARCELABLE)
        val imghewan = findViewById<ImageView>(R.id.img_item_photo)
        val namehewan= findViewById<TextView>(R.id.img_item_name)
        val deschewan= findViewById<TextView>(R.id.img_item_description)

        imghewan.setImageResource(hewan?.imghewan!!)
        namehewan.text = hewan.namehewan
        deschewan.text = hewan.deschewan

       fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }
    }
}