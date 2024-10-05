package dev.alexisvillarruel.logingpcparcial_reciclyeview.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.alexisvillarruel.logingpcparcial_reciclyeview.R
import dev.alexisvillarruel.logingpcparcial_reciclyeview.ui.model.exmModel

class ItemAdapter(private var lstitem: List<exmModel>):
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val ivitem : ImageView   = itemView.findViewById(R.id.ivitem)
        val tvtittle : TextView  = itemView.findViewById(R.id.tvtittle)
        val tvdescripcion : TextView = itemView.findViewById(R.id.tvdescripcion)
        val tvaño : TextView = itemView.findViewById(R.id.tvaño)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int {
        return lstitem.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = lstitem[position]
        holder.ivitem.setImageResource(item.image)
        holder.tvtittle.text = item.title
        holder.tvdescripcion.text = item.description
        holder.tvaño.text = item.año.toString()
    }
}