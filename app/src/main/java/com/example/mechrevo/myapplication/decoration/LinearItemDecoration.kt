package com.example.mechrevo.myapplication.decoration

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class LinearItemDecoration : RecyclerView.ItemDecoration() {

    var mPaint: Paint? = null

    init {
        mPaint = Paint()
        mPaint.apply {
            this!!.color = Color.RED
            textSize = 20F
        }
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        //指的是撑开的部分 不是指整个Item本身
        outRect.top = 1
        outRect.left = 200
    }

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)
//        val childCount = parent.childCount
//        val layoutManager = parent.layoutManager
//        for (index in 0..childCount) {
//            val childView = parent.getChildAt(index)
//            val left = layoutManager?.getLeftDecorationWidth(childView)
//            val top = layoutManager?.getTopDecorationHeight(childView)
//            val right = layoutManager?.getRightDecorationWidth(childView)
//            val bottom = layoutManager?.getBottomDecorationHeight(childView)
//            val cx = left!! / 2
//            val cy = childView.top + childView.height / 2
//            c.drawCircle(cx.toFloat(), cy.toFloat(), 20F, mPaint)
//        }
//        val state1 = state
    }


}
