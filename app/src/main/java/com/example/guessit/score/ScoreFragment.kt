package com.example.guessit.score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.guessit.R
import com.example.guessit.databinding.FragmentScoreBinding


class ScoreFragment : Fragment() {
    private lateinit var binding: FragmentScoreBinding
    val args: ScoreFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_score,container,false)

        binding.scoretext.text = args.score.toString()
        binding.playagainbutton.setOnClickListener { onPlayAgain() }

        return  binding.root

    }

    private fun onPlayAgain() {
        findNavController().navigate(ScoreFragmentDirections.actionScoreFragmentToGameFragment())
    }

}