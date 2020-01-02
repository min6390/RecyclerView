package com.example.recyclerview2row

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecyclerView2(val arr2: Array<data>): RecyclerView.Adapter<RecyclerView1ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView1ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview,parent,false)
        return RecyclerView1ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arr2.size
    }

    override fun onBindViewHolder(holder: RecyclerView1ViewHolder, position: Int) {
        val data1 = arr2.get(position)
        holder.diaChi1.text = data1.diaChi
        holder.hinh1.setImageResource(data1.hinhAnh)
        holder.name1.text = data1.name
        holder.sales1.text = data1.sales
    }
}
class RecyclerView2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val name1 : TextView = itemView.findViewById(R.id.tvName)
    val diaChi1 : TextView = itemView.findViewById(R.id.tvAddress)
    val sales1 : TextView = itemView.findViewById(R.id.tvSales)
    val hinh1 : ImageView = itemView.findViewById(R.id.ivView)

}
