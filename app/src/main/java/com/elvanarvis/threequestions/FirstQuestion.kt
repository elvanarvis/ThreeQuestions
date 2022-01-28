package com.elvanarvis.threequestions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.elvanarvis.threequestions.databinding.FragmentFirstQuestionBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class FirstQuestion : Fragment(R.layout.fragment_first_question) {

    private val binding by viewBinding(FragmentFirstQuestionBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.firstButton.setOnClickListener {

            val answer = when {
                binding.firstQuestion.text.toString().equals("es", ignoreCase = true) -> true
                else -> false

            }



            findNavController().navigate(
                FirstQuestionDirections.actionFirstQuestion2ToResult(
                    answer
                ))

        }
    }
}