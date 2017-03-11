package com.kurume_nct.prolabalarm.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kurume_nct.prolabalarm.R
import com.kurume_nct.prolabalarm.view.dummy.DummyContent

class AlarmListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_alarm_list, container, false)
        val recyclerView = view.findViewById(R.id.recycler_view) as RecyclerView
        val context = recyclerView.context
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = AlarmRecyclerViewAdapter(DummyContent.items)
        return view
    }
}
