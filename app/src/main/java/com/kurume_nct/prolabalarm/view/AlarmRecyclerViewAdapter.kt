package com.kurume_nct.prolabalarm.view

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kurume_nct.prolabalarm.BR

import com.kurume_nct.prolabalarm.R
import com.kurume_nct.prolabalarm.viewmodel.AlarmViewModel

class AlarmRecyclerViewAdapter(private val alarmList: List<AlarmViewModel>)
    : RecyclerView.Adapter<AlarmRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_alarm, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val alarm = alarmList[position]

        holder.binding.setVariable(BR.alarm, alarm)
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int {
        return alarmList.size
    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val binding: ViewDataBinding = DataBindingUtil.bind(view)
    }
}
