package com.lca.odari.alc40.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lca.odari.alc40.R
import kotlinx.android.synthetic.main.fragment_alc_view.view.*


class AlcViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_alc_view, container, false)
        view.webview.apply {
            loadUrl(getString(R.string.alc_link))
        }
        return view
    }


}
