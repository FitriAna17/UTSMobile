package com.example.utsmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val  INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hewanList = listOf<hewan>(
            hewan(
                R.drawable.golden,
                namehewan = "Golden",
                deschewan = "Warna bulu keemasan membuat tingkat keimutan binatang ini meningkat."
        ),
            hewan(
                R.drawable.kucingpasir,
                namehewan = "kucingpasir",
                deschewan = "sejenis kucing yang tergolong famili Felidae yang hanya ditemukan di padang pasir sejati,"
        ),
             hewan(
                 R.drawable.lordeard,
                 namehewan = "lordeard",
                 deschewan = "Jerboa adalah jenis tikus yang jalannya melompa."
        ),
             hewan(
                 R.drawable.pika,
                 namehewan =  "Pika",
                 deschewan = "Pika merupakan anggota ordo Lagomorpha."
        ),
              hewan(
                   R.drawable.quokka,
                   namehewan = "Quokka",
                   deschewan = "Quokka disebut sebagai binatang paling bahagia."
        ),
              hewan(
                  R.drawable.rabbit,
                  namehewan = "Rabbit",
                  deschewan = "Ini adalah jenis kelinci terkecil di dunia. Kelinci jenis ini memiliki habitat di Amerika Utara."
        ),
               hewan(
                   R.drawable.sugarglider,
                   namehewan = "SugarGlider",
                   deschewan = "Binatang nokturnal bermata besar ini memang sangat menggemaskan."
        ),
               hewan(
                   R.drawable.kancil,
                   namehewan = "Kancil",
                   deschewan = "sekilas wajahnya campuran dari babi, rusa dan tikus."
        ),
               hewan(
                   R.drawable.opossum,
                   namehewan = "opossum",
                   deschewan = "opossum biasanya akan pura-pura mati sehingga musuhnya tidak mengejarnya.."
        ),
               hewan(
                   R.drawable.stoat,
                   namehewan = "stoat",
                   deschewan = "Bentuknya persis seperti musang namun ukurannya lebih kecil."
               )
        )
         val recyclerView = findViewById<RecyclerView>(R.id.tv_hewan)
         recyclerView.layoutManager = LinearLayoutManager(this)
         recyclerView.setHasFixedSize(true)
         recyclerView.adapter = hewanadapter(this,hewanList){
             intent.putExtra(INTENT_PARCELABLE,it)
             startActivity(intent)
             val intent = Intent (this, detailhewanActivity2:: class.java)
             intent.putExtra(INTENT_PARCELABLE, it)
             startActivity(intent)

         }
    }
    }
