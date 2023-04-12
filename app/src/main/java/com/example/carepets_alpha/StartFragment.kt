package com.example.carepets_alpha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.delay

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Thread.sleep(2000)
        findNavController().navigate(R.id.action_startFragment_to_petListFragment)
        return inflater.inflate(R.layout.fragment_start, container, false)
    }


}