package com.lca.odari.alc40.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lca.odari.alc40.R
import com.lca.odari.alc40.databinding.FragmentAlcParticipantBinding
import com.lca.odari.alc40.domain.Participant


class AlcParticipantFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentAlcParticipantBinding.inflate(inflater, container, false)
        binding.participant = Participant(
            getString(R.string.name),
            getString(R.string.track),
            getString(R.string.country),
            getString(R.string.email),
            getString(R.string.phone),
            getString(R.string.username),
            "https://i.ibb.co/xm4RWTs/profile-Hackathon.jpg"
        )
        return binding.root
    }

}
