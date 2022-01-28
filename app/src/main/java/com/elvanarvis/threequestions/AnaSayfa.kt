package com.elvanarvis.threequestions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.elvanarvis.threequestions.databinding.FragmentAnaSayfaBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class AnaSayfa : Fragment(R.layout.fragment_ana_sayfa) {
    private val binding by viewBinding(FragmentAnaSayfaBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            homeFirst.setOnClickListener {

                findNavController().navigate(R.id.action_anaSayfa_to_firstQuestion2)

            }

            homeSecond.setOnClickListener {

                findNavController().navigate(R.id.action_anaSayfa_to_secondQuestion2)

            }

            homeThird.setOnClickListener {

                findNavController().navigate(R.id.action_anaSayfa_to_thirdFragment)

            }



        }
    }


}