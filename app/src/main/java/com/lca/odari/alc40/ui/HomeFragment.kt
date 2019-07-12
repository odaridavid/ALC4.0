package com.lca.odari.alc40.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.lca.odari.alc40.R
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.about_alc_button.setOnClickListener { v ->
            v.findNavController().navigate(R.id.action_homeFragment_to_alcViewFragment)
        }
        view.my_profile_button.setOnClickListener { v ->
            v.findNavController().navigate(R.id.action_homeFragment_to_alcParticipantFragment)
        }
        return view
    }


}
