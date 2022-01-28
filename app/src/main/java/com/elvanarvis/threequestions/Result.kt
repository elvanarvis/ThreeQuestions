package com.elvanarvis.threequestions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.elvanarvis.threequestions.databinding.FragmentResultBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class Result : Fragment(R.layout.fragment_result) {

    private val binding by viewBinding(FragmentResultBinding::bind)
    private val args: ResultArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            resultText.text = when{

                args.answer.equals(true) -> "Tebrikler bildiniz!"
                else -> "Üzgünüz bilemediniz!"

            }

            resultButton.setOnClickListener {

                findNavController().navigate(R.id.action_result_to_anaSayfa)

            }
        }
    }
}
