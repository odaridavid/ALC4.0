package com.lca.odari.alc40

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso
import timber.log.Timber

/**
 * Created By David Odari
 * On 13/07/19
 *
 **/

@BindingAdapter("app:loadImage")
fun ImageView.bindImage(imageUrl: String?) {
    Picasso.get()
        .load(imageUrl)
        .into(this)
    Timber.d("Binding Image from $imageUrl")
}