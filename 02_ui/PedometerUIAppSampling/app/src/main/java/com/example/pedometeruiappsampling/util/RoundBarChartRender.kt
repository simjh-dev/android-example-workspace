package com.example.pedometeruiappsampling.util

import android.graphics.*
import com.github.mikephil.charting.animation.ChartAnimator
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet
import com.github.mikephil.charting.renderer.BarChartRenderer
import com.github.mikephil.charting.utils.Utils
import com.github.mikephil.charting.utils.ViewPortHandler
import kotlin.math.ceil
import kotlin.math.min


class RoundBarChartRender(
    chart: BarDataProvider,
    animator: ChartAnimator,
    viewPortHandler: ViewPortHandler
) : BarChartRenderer(chart, animator, viewPortHandler) {

    private val mBarShadowRectBuffer = RectF()
    private var radius = 0

    fun setRadius(radius: Int) {
        this.radius = radius
    }

    override fun drawDataSet(c: Canvas, dataSet: IBarDataSet, index: Int) {

        val trans = mChart.getTransformer(dataSet.axisDependency)
        mBarBorderPaint.color = dataSet.barBorderColor
        mBarBorderPaint.strokeWidth = Utils.convertDpToPixel(dataSet.barBorderWidth)
        mShadowPaint.color = dataSet.barShadowColor

        val drawBorder = dataSet.barBorderWidth > 0f

        val phaseX = mAnimator.phaseX
        val phaseY = mAnimator.phaseY

        if (mChart.isDrawBarShadowEnabled) {
            mShadowPaint.color = dataSet.barShadowColor

            val barData = mChart.barData

            val barWidth = barData.barWidth
            val barWidthHalf = barWidth / 2.0f
            var x = 0
            var i = 0

            val count =
                min(
                    ceil(dataSet.entryCount * phaseX).toInt(), dataSet.entryCount
                )
            while (i < count) {
                val e = dataSet.getEntryForIndex(i)
                x = e.x.toInt();

                mBarShadowRectBuffer.left = x - barWidthHalf;
                mBarShadowRectBuffer.right = x + barWidthHalf;

                trans.rectValueToPixel(mBarShadowRectBuffer);

                if (!mViewPortHandler.isInBoundsLeft(mBarShadowRectBuffer.right)) {
                    i++;
                    continue;
                }

                if (!mViewPortHandler.isInBoundsRight(mBarShadowRectBuffer.left))
                    break;

                mBarShadowRectBuffer.top = mViewPortHandler.contentTop();
                mBarShadowRectBuffer.bottom = mViewPortHandler.contentBottom();

                c.drawRoundRect(mBarRect, radius.toFloat(), radius.toFloat(), mShadowPaint);
                i++;
            }
        }

        // initialize the buffer
        val buffer = mBarBuffers[index];
        buffer.setPhases(phaseX, phaseY);
        buffer.setDataSet(index);
        buffer.setInverted(mChart.isInverted(dataSet.axisDependency));
        buffer.setBarWidth(mChart.barData.barWidth)

        buffer.feed(dataSet);

        trans.pointValuesToPixel(buffer.buffer);

        val isSingleColor = dataSet.colors.size == 1
        if (isSingleColor) {
            mRenderPaint.color = dataSet.color
        }

        var j = 0
        while (j < buffer.size()) {

            if (!mViewPortHandler.isInBoundsLeft(buffer.buffer[j + 2])) {
                j += 4;
                continue;
            }

            if (!mViewPortHandler.isInBoundsRight(buffer.buffer[j]))
                break;

            if (!isSingleColor) {
                // Set the color for the currently drawn value. If the index
                // is out of bounds, reuse colors.
                mRenderPaint.color = dataSet.getColor(j / 4);
            }

            if (dataSet.gradientColor != null) {
                val gradientColor = dataSet.gradientColor
                mRenderPaint.shader = LinearGradient(
                    buffer.buffer[j],
                    buffer.buffer[j + 3],
                    buffer.buffer[j],
                    buffer.buffer[j + 1],
                    gradientColor.startColor,
                    gradientColor.endColor,
                    Shader.TileMode.MIRROR
                );
            }

            if (dataSet.gradientColors != null) {
                mRenderPaint.shader = LinearGradient(
                    buffer.buffer[j],
                    buffer.buffer[j + 3],
                    buffer.buffer[j],
                    buffer.buffer[j + 1],
                    dataSet.getGradientColor(j / 4).startColor,
                    dataSet.getGradientColor(j / 4).endColor,
                    Shader.TileMode.MIRROR
                );
            }
            val path2 = roundRect(
                RectF(
                    buffer.buffer[j], buffer.buffer[j + 1], buffer.buffer[j + 2],
                    buffer.buffer[j + 3]
                ), radius.toFloat(), radius.toFloat(), tl = true, tr = true, br = true, bl = true
            );
            c.drawPath(path2, mRenderPaint);
            if (drawBorder) {
                val path = roundRect(
                    RectF(
                        buffer.buffer[j], buffer.buffer[j + 1], buffer.buffer[j + 2],
                        buffer.buffer[j + 3]
                    ),
                    radius.toFloat(),
                    radius.toFloat(),
                    tl = true,
                    tr = true,
                    br = true,
                    bl = true
                );
                c.drawPath(path, mBarBorderPaint);
            }
            j += 4;
        }

    }

    private fun roundRect(
        rect: RectF,
        rx: Float,
        ry: Float,
        tl: Boolean,
        tr: Boolean,
        br: Boolean,
        bl: Boolean
    )
            : Path {
        val top = rect.top;
        val left = rect.left;
        val right = rect.right;
        val bottom = rect.bottom;
        val path = Path();
        var _rx = if (rx < 0) 0F else rx
        var _ry = if (ry < 0) 0F else ry

        val width = right - left;
        val height = bottom - top;
        if (_rx > width / 2) _rx = width / 2;
        if (_ry > height / 2) _ry = height / 2;
        val widthMinusCorners = (width - (2 * _rx));
        val heightMinusCorners = (height - (2 * _ry));

        path.moveTo(right, top + _ry);
        if (tr)
            path.rQuadTo(0f, -_ry, -_rx, -_ry);//top-right corner
        else {
            path.rLineTo(0f, -_ry)
            path.rLineTo(-rx, 0f)
        }
        path.rLineTo(-widthMinusCorners, 0f)
        if (tl)
            path.rQuadTo(-rx, 0f, -_rx, _ry); //top-left corner
        else {
            path.rLineTo(-rx, 0f);
            path.rLineTo(0f, _ry);
        }
        path.rLineTo(0f, heightMinusCorners);

        if (bl)
            path.rQuadTo(0f, _ry, _rx, _ry);//bottom-left corner
        else {
            path.rLineTo(0f, _ry);
            path.rLineTo(_rx, 0f);
        }

        path.rLineTo(widthMinusCorners, 0f);
        if (br)
            path.rQuadTo(_rx, 0f, _rx, -_ry); //bottom-right corner
        else {
            path.rLineTo(_rx, 0f);
            path.rLineTo(0f, -_ry);
        }

        path.rLineTo(0f, -heightMinusCorners);

        path.close();//Given close, last lineto can be removed.

        return path;
    }
}
