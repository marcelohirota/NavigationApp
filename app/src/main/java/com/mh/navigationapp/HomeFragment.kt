package com.mh.navigationapp

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.mh.navigationapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        // Button Click event
        binding.submitBtn.setOnClickListener {

            if (!TextUtils.isEmpty(binding.nameET.text.toString())) {

                val bundle = bundleOf("name" to binding.nameET.text.toString())
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment, bundle)

            } else {
                Toast.makeText(activity, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }




        return binding.root
    }


}