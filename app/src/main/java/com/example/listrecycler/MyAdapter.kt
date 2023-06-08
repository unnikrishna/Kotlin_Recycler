package com.example.listrecycler

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_items.view.*

class MyAdapter(val context: Context, val raceList: List<Result>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var givenName:TextView
        var familyName:TextView

        init {
            givenName = itemView.givenName
            familyName = itemView.familyName

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.givenName.text = raceList[position].Driver.givenName.toString()
        holder.familyName.text = raceList[position].Driver.familyName.toString()

    }

    override fun getItemCount(): Int {
        Log.d("MY ADAPTER", "getItemCount---------------------------------: "+raceList.size )
        return raceList.size
    }
}