package com.example.advancedandroidtraining.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.advancedandroidtraining.R
import com.example.advancedandroidtraining.model.CountryModel

class CountryAdapter(private val countryList: ArrayList<CountryModel>): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    class CountryViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.country_name)
        val textViewRegion: TextView = view.findViewById(R.id.country_region)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_counrty,parent,false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.textViewRegion.text = countryList[position].countryRegion
        holder.textView.text = countryList[position].countryName
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    fun updateCountryList(newCountryList: List<CountryModel>){
        countryList.clear()
        countryList.addAll(newCountryList)
        notifyDataSetChanged()
    }
}