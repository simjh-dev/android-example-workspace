package com.example.pedometeruiappsampling.util

import android.content.Context
import com.example.pedometeruiappsampling.R
import com.example.pedometeruiappsampling.domain.WeekGoal
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import java.text.SimpleDateFormat
import java.util.*
import kotlin.random.Random

class Util {

    companion object {

        private val TAG = this::class.java.simpleName

        fun getChartDailyXValue(context: Context) : List<String> {
            val cal = Calendar.getInstance()
            val sdf = SimpleDateFormat("MM/dd")
            val today = sdf.format(cal.time)
            cal.add(Calendar.MONTH, -1)
            val xvalue = arrayListOf<String>()
            while(true) {
                val date = sdf.format(cal.time)
                if(today != date) {
                    xvalue.add(date)
                } else {
                    xvalue.add(context.getString(R.string.text_today))
                    break
                }
                cal.add(Calendar.DAY_OF_MONTH, 1)
            }

            return xvalue
        }

        fun getChartWeekXValue() : List<String> {
            val cal = Calendar.getInstance()
            val sdf = SimpleDateFormat("MM/dd")
            cal.set(Calendar.DAY_OF_WEEK, 2)    // monday

            val mondayOfThisWeek = sdf.format(cal.time)
            cal.add(Calendar.MONTH, -3) // 3 month ago
            cal.set(Calendar.DAY_OF_WEEK, 2)    // monday
            val xvalue = arrayListOf<String>()
            while(true) {
                val monday = sdf.format(cal.time)
                cal.add(Calendar.DAY_OF_MONTH, 6)
                val sunday = sdf.format(cal.time)
                if(mondayOfThisWeek != monday) {
                    xvalue.add("$monday~$sunday")
                } else {
                    xvalue.add("$mondayOfThisWeek~")
                    break
                }
                cal.add(Calendar.DAY_OF_MONTH, 1)
            }
            return xvalue
        }

        fun getChartDailyDataSet(size: Int, context: Context) : BarDataSet {
            val barEntries = arrayListOf<BarEntry>()
            for (i in 0 until size) {
                barEntries.add(BarEntry(i.toFloat(), Random.nextInt(0, 10000).toFloat()))
            }
            return BarDataSet(barEntries, context.getString(R.string.text_bar_chart))
        }

        fun getChartWeekDataSet(size: Int, context: Context) : BarDataSet {
            val barEntries = arrayListOf<BarEntry>()
            for (i in 0 until size) {
                barEntries.add(BarEntry(i.toFloat(), (Random.nextInt(0, 10000) * 7).toFloat()))
            }
            return BarDataSet(barEntries, context.getString(R.string.text_bar_chart))
        }

        fun getDataWeekGoal(context: Context) : List<WeekGoal> {
            return listOf(
                WeekGoal(true, context.getString(R.string.text_sun)),
                WeekGoal(true, context.getString(R.string.text_mon)),
                WeekGoal(false, context.getString(R.string.text_tue)),
                WeekGoal(false, context.getString(R.string.text_wed)),
                WeekGoal(false, context.getString(R.string.text_thu)),
                WeekGoal(false, context.getString(R.string.text_fri)),
                WeekGoal(false, context.getString(R.string.text_sat)),
            )
        }
    }
}