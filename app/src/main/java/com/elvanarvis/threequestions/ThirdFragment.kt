package com.elvanarvis.threequestions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.elvanarvis.threequestions.databinding.FragmentThirdBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {

    private val binding by viewBinding(FragmentThirdBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.thirdButton.setOnClickListener {

            val answer = when {
                binding.thirdQuestion.text.toString().equals("norveç", ignoreCase = true) -> true
                else -> false
            }
            findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToResult(answer))
        }

    }
}

