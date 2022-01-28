package com.elvanarvis.threequestions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.elvanarvis.threequestions.databinding.FragmentSecondQuestionBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class SecondQuestion : Fragment(R.layout.fragment_second_question) {

    private val binding by viewBinding(FragmentSecondQuestionBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.secondButton.setOnClickListener {

            val answer = when {
                binding.secondQuestion.text.toString().equals("koku", ignoreCase = true) -> true
                else -> false
            }
            findNavController().navigate(
                SecondQuestionDirections.actionSecondQuestion2ToResult(
                    answer
                )
            )

        }

    }


}


