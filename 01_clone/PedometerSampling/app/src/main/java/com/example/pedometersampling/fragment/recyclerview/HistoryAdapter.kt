package com.example.pedometersampling.fragment.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pedometersampling.databinding.RvItemHistoryBinding
import com.example.pedometersampling.room.Pedometer
import com.example.pedometersampling.util.Util

class HistoryAdapter(private val _list: List<Pedometer>, private val context: Context?) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val list = _list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding: RvItemHistoryBinding =
            RvItemHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]
        (holder as HistoryViewHolder).bind(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class HistoryViewHolder(private val binding: RvItemHistoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Pedometer) {
            binding.model = HistoryViewModel(
                Util.convertDate(item.date)
            )

            binding.recyclerViewSteps.layoutManager = LinearLayoutManager(context)
            binding.recyclerViewSteps.addItemDecoration(
                DividerItemDecoration(
                    context,
                    LinearLayoutManager(context).orientation
                )
            )
            binding.recyclerViewSteps.adapter =
                StepsAdapter(Util.fillStepsList(Util.fromStepsJson(item.steps)))
        }
    }
}