package com.lca.odari.alc40

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView


/**
 * Created By David Odari
 * On 13/07/19
 *
 **/
class ProfileImageView : AppCompatImageView {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        //Unpack given dimens to new aspect ratio
        val threeTwoHeight = MeasureSpec.getSize(widthMeasureSpec) * 2 / 3
        val threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY)
        super.onMeasure(widthMeasureSpec, threeTwoHeightSpec)
    }
}