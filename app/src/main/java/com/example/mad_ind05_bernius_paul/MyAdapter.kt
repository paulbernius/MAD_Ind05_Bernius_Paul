package com.example.mad_ind05_bernius_paul

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(
    private val statesList : ArrayList<States>,
    private val listener : OnItemClickListener
) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Get format for recycler from list_item
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Add elements to recycler
        val currentItem = statesList[position]
        holder.title.text = currentItem.title
        holder.subTitle.text = currentItem.subTitle
    }

    override fun getItemCount(): Int {
        // Get size of recycler
        return statesList.size
    }

    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView),
    View.OnClickListener {
        val title : TextView = itemView.findViewById(R.id.titleTextView) // Get state name text component
        val subTitle : TextView = itemView.findViewById(R.id.subTitleTextView) // Get state nickname text componnent

        init {
            itemView.setOnClickListener(this)
        }

        // When an element gets clicked
        override fun onClick(p0: View?) {
            val position : Int = adapterPosition // Get position of element clicked
            if (position != RecyclerView.NO_POSITION) { // Make sure element exists
                listener.onItemClick(position) // Call click listener passing the position
            }
        }
    }

    // Create interface to implement in MainActivity
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}