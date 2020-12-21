package com.example.database_sqlite

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DBAdapter(private val listDataku: ArrayList<DBModel>): RecyclerView.Adapter<DBAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemV: View): RecyclerView.ViewHolder(itemV) {
        var tvemailku: TextView = itemV.findViewById(R.id.tv_emailku)
        var tvpassku: TextView = itemV.findViewById(R.id.tv_passku)
        var tvakunku: TextView = itemV.findViewById(R.id.tv_akunku)
        var tvnamaku: TextView = itemV.findViewById(R.id.tv_namaku)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_dataku, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val dataku = listDataku[position]
        holder.tvemailku.text = dataku.email
        holder.tvpassku.text = dataku.pass
        holder.tvakunku.text = dataku.username
        holder.tvnamaku.text = dataku.fullname

    }

    override fun getItemCount(): Int {
        return listDataku.size
    }
}