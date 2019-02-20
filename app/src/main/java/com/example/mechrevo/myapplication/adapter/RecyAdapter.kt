package com.example.mechrevo.myapplication.adapter

import android.content.Context
import android.graphics.Color
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mechrevo.myapplication.R

class RecyAdapter(private val context: Context) : RecyclerView.Adapter<RecyAdapter.InnerViewHolder>() {

    override fun getItemCount() = 30

    override fun onBindViewHolder(p0: InnerViewHolder, p1: Int) {
        p0.tvGuide.text = "当前的数据结果是"
    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): InnerViewHolder {
        val inflaterView = LayoutInflater.from(context).inflate(
            R.layout.adapter_recycle,
            p0,
            false
        )
        return InnerViewHolder(inflaterView)
    }

    class InnerViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rootLayout: LinearLayout = itemView as LinearLayout
        val tvGuide = rootLayout.findViewById<TextView>(R.id.tvContent)
    }

    fun TextView.isBold() = this.apply {
        paint.isFakeBoldText = true
    }

}