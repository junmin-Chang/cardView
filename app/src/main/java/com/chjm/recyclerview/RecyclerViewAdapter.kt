package com.chjm.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    private val itemTitles = arrayOf("text1", "text2", "text3", "text4", " text5", " text6")
    private val itemDetails = arrayOf("text1Des", "text2Des", "text3Des", "text4Des", "text5Des", "text6Des")

    private val itemImages = intArrayOf(
        R.drawable.ic_landscape1,
        R.drawable.ic_landscape2,
        R.drawable.ic_landscape3,
        R.drawable.ic_landscape4,
        R.drawable.ic_landscape5,
        R.drawable.ic_landscape6

    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var textTitle: TextView
        var textDes: TextView

        init {

            image = itemView.findViewById(R.id.item_image)
            textTitle = itemView.findViewById(R.id.item_title)
            textDes = itemView.findViewById(R.id.item_details)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_model, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return itemTitles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.textTitle.text = itemTitles[position]
        holder.textDes.text = itemDetails[position]

        holder.image.setImageResource(itemImages[position])

        holder.itemView.setOnClickListener { view: View ->
            Toast.makeText(view.context, "Clicked on the item", Toast.LENGTH_SHORT).show()
        }
    }
}

