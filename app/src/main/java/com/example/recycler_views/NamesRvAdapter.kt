package com.example.recycler_views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class NamesRvAdapter(var numbersList:List<Int>) : Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {

        var itemView = LayoutInflater.from(parent.context).inflate(R.
        layout.name_list, parent, false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {

        var currentName=numbersList.get(position)
        holder.tvNum.text = currentName.toString()
    }

    override fun getItemCount(): Int {

        return numbersList.size
    }
}
class NamesViewHolder(itemView: View): ViewHolder(itemView){
    var tvNum=itemView.findViewById<TextView>(R.id.tvNum)

}