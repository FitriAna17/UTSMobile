package com.example.utsmobile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class hewanadapter (private val context: Context,private val hewan: List<hewan>, val listener: (hewan) -> Unit)
    : RecyclerView.Adapter<hewanadapter.hewanViewHoolder>(){

    class hewanViewHoolder (view: View): RecyclerView.ViewHolder(view){

        val imghewan = view.findViewById<ImageView>(R.id.img_item_photo)
        val namehewan = view.findViewById<TextView>(R.id.img_item_name)
        val deschewan = view.findViewById<TextView>(R.id.img_item_description)


        fun bindview(hewan: hewan, Listener: (hewan) -> Unit){
            imghewan.setImageLevel(hewan.imghewan)
            namehewan.text = hewan.namehewan
            deschewan.text = hewan.deschewan
            itemView.setOnClickListener{
                Listener(hewan)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): hewanViewHoolder {
        return hewanViewHoolder(
            LayoutInflater.from(context).inflate(R.layout.item_hewan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: hewanViewHoolder, position: Int) {
        holder.bindview(hewan[position], listener)
    }

    override fun getItemCount(): Int = hewan.size
    }