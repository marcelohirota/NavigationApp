package com.mh.navigationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.mh.navigationapp.databinding.FragmentSecondBinding


class secondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil
            .inflate(inflater, R.layout.fragment_second, container, false)

        var input = arguments!!.getString("name")
        binding.textViewSecondFragment.text = input.toString()
        return binding.root
    }
}