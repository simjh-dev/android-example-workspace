package com.example.pedometeruiappsampling.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pedometeruiappsampling.R
import com.example.pedometeruiappsampling.databinding.FragmentHistoryBinding
import com.example.pedometeruiappsampling.util.*
import com.github.mikephil.charting.components.LimitLine
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.ValueFormatter
import com.github.mikephil.charting.model.GradientColor

class HistoryFragment : BaseFragment() {

    private var _binding: FragmentHistoryBinding? = null
    private val binding get() = _binding!!
    private val TAG = this::class.java.simpleName

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        setChartDaily()
        setChartDailyAverageLine()
        binding.chartDaily.setOnTouchListener { _, _ ->
            setChartDailyAverageLine()
            false
        }

        setChartWeek()
        setChartWeekAverageLine()
        binding.chartWeek.setOnTouchListener { _, _ ->
            setChartWeekAverageLine()
            false
        }
    }

    private fun setChartDaily() {
        val xvalue = Util.getChartDailyXValue(requireContext())
        val barDataset = Util.getChartDailyDataSet(xvalue.size, requireContext())
        // gradient bar color
        barDataset.gradientColors = listOf(
            GradientColor(
                resources.getColor(R.color.app_color),
                resources.getColor(R.color.app_orange)
            )
        )

        // barData text visible false because of lineData duplication
        val data = BarData(barDataset)
        data.barWidth = SIZE_BAR_WIDTH
        data.isHighlightEnabled = false
        binding.chartDaily.data = data

        binding.chartDaily.description.isEnabled = false
        binding.chartDaily.legend.isEnabled = false
        binding.chartDaily.setScaleEnabled(false)
        binding.chartDaily.isDoubleTapToZoomEnabled = false

        val goal = if (context != null && context?.getSharedPreferences(
                activity?.getString(R.string.text_goal),
                Context.MODE_PRIVATE
            ) != null
        ) {
            context?.getSharedPreferences(activity?.getString(R.string.text_goal), Context.MODE_PRIVATE)!!
                .getInt(activity?.getString(R.string.text_goal), DEFAULT_GOAL)
        } else {
            DEFAULT_GOAL
        }
        val goalLine = LimitLine(goal.toFloat(), activity?.getString(R.string.text_goal))
        goalLine.lineWidth = SIZE_GOAL_LINE_WIDTH
        goalLine.textSize = SIZE_GOAL_LINE
        goalLine.lineColor = resources.getColor(R.color.app_color)
        goalLine.textColor = resources.getColor(R.color.app_color)
        binding.chartDaily.axisLeft.addLimitLine(goalLine)
        binding.chartDaily.axisLeft.setDrawAxisLine(false)
        binding.chartDaily.axisLeft.setDrawGridLines(false)
        binding.chartDaily.axisLeft.axisMinimum = 0f
        binding.chartDaily.axisLeft.axisMaximum = (goal + (goal / 10)).toFloat()
        binding.chartDaily.axisRight.isEnabled = false

        val chartRenderer = RoundBarChartRender(
            binding.chartDaily,
            binding.chartDaily.animator,
            binding.chartDaily.viewPortHandler
        )
        chartRenderer.setRadius(SIZE_RADIUS)
        binding.chartDaily.renderer = chartRenderer
        binding.chartDaily.xAxis.textColor = resources.getColor(R.color.app_color)
        binding.chartDaily.xAxis.spaceMin = SIZE_SPACE
        binding.chartDaily.xAxis.spaceMax = SIZE_SPACE
        binding.chartDaily.xAxis.valueFormatter = object : ValueFormatter() {
            override fun getFormattedValue(value: Float): String {
                val index = value.toInt()
                return xvalue[index]
            }
        }
        binding.chartDaily.xAxis.setDrawGridLines(false)
        binding.chartDaily.xAxis.setDrawAxisLine(false)
        binding.chartDaily.xAxis.textSize = TEXT_SIZE_X_AXIS
        binding.chartDaily.xAxis.position = XAxis.XAxisPosition.BOTTOM
        binding.chartDaily.extraBottomOffset = EXTRA_BOTTOM_OFFSET
        // xAxis print 6 item of one time, add horizontal scroll
        binding.chartDaily.setVisibleXRangeMaximum(SIZE_X_RANGE_MAXIMUM)
        // show most right, most last item
        binding.chartDaily.moveViewToX(xvalue.size.toFloat())

        binding.chartDaily.animateY(DURATION_ANIMATION_Y)
        binding.chartDaily.invalidate()
    }

    private fun setChartDailyAverageLine() {
        var average = 0
        val minIdx = binding.chartDaily.lowestVisibleX.toInt()
        val maxIdx = binding.chartDaily.highestVisibleX.toInt()
        for (i in minIdx..maxIdx) {
            val item = binding.chartDaily.data.dataSets[0].getEntryForIndex(i)
            average += item.y.toInt()
        }
        average = (average / (maxIdx - minIdx + 1))
        val averageLine = LimitLine(average.toFloat(), requireContext().getString(R.string.text_average))
        averageLine.lineWidth = SIZE_AVERAGE_LINE_WIDTH
        averageLine.textSize = TEXT_SIZE_AVERAGE_LINE
        averageLine.lineColor = resources.getColor(R.color.light_blue)
        averageLine.textColor = resources.getColor(R.color.light_blue)
        averageLine.enableDashedLine(LINE_LENGTH_DASHED_LINE, SPACE_LENGTH_DASHED_LINE, 0f)

        binding.chartDaily.axisLeft.limitLines.forEach { ll ->
            if (ll.label == requireContext().getString(R.string.text_average)) {
                binding.chartDaily.axisLeft.removeLimitLine(ll)
            }
        }
        binding.chartDaily.axisLeft.addLimitLine(averageLine)
    }

    private fun setChartWeek() {
        val xvalue = Util.getChartWeekXValue()
        val barDataset = Util.getChartWeekDataSet(xvalue.size, requireContext())
        // gradient bar color
        barDataset.gradientColors = listOf(
            GradientColor(
                resources.getColor(R.color.app_color),
                resources.getColor(R.color.app_orange)
            )
        )

        // barData text visible false because of lineData duplication
        val data = BarData(barDataset)
        data.barWidth = SIZE_BAR_WIDTH
        data.isHighlightEnabled = false
        binding.chartWeek.data = data

        binding.chartWeek.description.isEnabled = false
        binding.chartWeek.legend.isEnabled = false
        binding.chartWeek.setScaleEnabled(false)
        binding.chartWeek.isDoubleTapToZoomEnabled = false

        val goal = if (context != null && context?.getSharedPreferences(
                activity?.getString(R.string.text_goal),
                Context.MODE_PRIVATE
            ) != null
        ) {
            context?.getSharedPreferences(activity?.getString(R.string.text_goal), Context.MODE_PRIVATE)!!
                .getInt(activity?.getString(R.string.text_goal), DEFAULT_GOAL) * 7
        } else {
            DEFAULT_GOAL * 7
        }
        val goalLine = LimitLine(goal.toFloat(), activity?.getString(R.string.text_goal))
        goalLine.lineWidth = SIZE_GOAL_LINE_WIDTH
        goalLine.textSize = SIZE_GOAL_LINE
        goalLine.lineColor = resources.getColor(R.color.app_color)
        goalLine.textColor = resources.getColor(R.color.app_color)
        binding.chartWeek.axisLeft.addLimitLine(goalLine)
        binding.chartWeek.axisLeft.setDrawAxisLine(false)
        binding.chartWeek.axisLeft.setDrawGridLines(false)
        binding.chartWeek.axisLeft.axisMinimum = 0f
        binding.chartWeek.axisLeft.axisMaximum = (goal + (goal / 10)).toFloat()
        binding.chartWeek.axisRight.isEnabled = false

        val chartRenderer = RoundBarChartRender(
            binding.chartWeek,
            binding.chartWeek.animator,
            binding.chartWeek.viewPortHandler
        )
        chartRenderer.setRadius(SIZE_RADIUS)
        binding.chartWeek.renderer = chartRenderer
        binding.chartWeek.xAxis.textColor = resources.getColor(R.color.app_color)
        binding.chartWeek.xAxis.spaceMin = SIZE_SPACE
        binding.chartWeek.xAxis.spaceMax = SIZE_SPACE
        binding.chartWeek.xAxis.valueFormatter = object : ValueFormatter() {
            override fun getFormattedValue(value: Float): String {
                val index = value.toInt()
                return xvalue[index]
            }
        }
        binding.chartWeek.xAxis.setDrawGridLines(false)
        binding.chartWeek.xAxis.setDrawAxisLine(false)
        binding.chartWeek.xAxis.textSize = TEXT_SIZE_X_AXIS
        binding.chartWeek.xAxis.position = XAxis.XAxisPosition.BOTTOM
        binding.chartWeek.extraBottomOffset = EXTRA_BOTTOM_OFFSET
        // xAxis print 6 item of one time, add horizontal scroll
        binding.chartWeek.setVisibleXRangeMaximum(SIZE_X_RANGE_MAXIMUM)
        // show most right, most last item
        binding.chartWeek.moveViewToX(xvalue.size.toFloat())
        binding.chartWeek.animateY(DURATION_ANIMATION_Y)
        binding.chartWeek.invalidate()
    }

    private fun setChartWeekAverageLine() {
        var average = 0
        val minIdx = binding.chartWeek.lowestVisibleX.toInt()
        val maxIdx = binding.chartWeek.highestVisibleX.toInt()
        for (i in minIdx..maxIdx) {
            val item = binding.chartWeek.data.dataSets[0].getEntryForIndex(i)
            average += item.y.toInt()
        }
        average = (average / (maxIdx - minIdx + 1))
        val averageLine = LimitLine(average.toFloat(), requireContext().getString(R.string.text_average))
        averageLine.lineWidth = SIZE_AVERAGE_LINE_WIDTH
        averageLine.textSize = TEXT_SIZE_AVERAGE_LINE
        averageLine.lineColor = resources.getColor(R.color.light_blue)
        averageLine.textColor = resources.getColor(R.color.light_blue)
        averageLine.enableDashedLine(LINE_LENGTH_DASHED_LINE, SPACE_LENGTH_DASHED_LINE, 0f)

        binding.chartWeek.axisLeft.limitLines.forEach { ll ->
            if (ll.label == requireContext().getString(R.string.text_average)) {
                binding.chartWeek.axisLeft.removeLimitLine(ll)
            }
        }
        binding.chartWeek.axisLeft.addLimitLine(averageLine)
    }

    companion object {
        private var instance: HistoryFragment? = null
        fun getInstance(): HistoryFragment {
            if (instance == null) {
                instance = HistoryFragment()
            }
            return instance!!
        }
    }
}