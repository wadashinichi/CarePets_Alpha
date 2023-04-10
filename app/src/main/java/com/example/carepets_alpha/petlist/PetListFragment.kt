package com.example.carepets_alpha.petlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carepets_alpha.MainActivity
import com.example.carepets_alpha.R
import com.example.carepets_alpha.database.Pet
import com.example.carepets_alpha.databinding.FragmentPetListBinding

class PetListFragment : Fragment(R.layout.fragment_pet_list) {

    lateinit var binding: FragmentPetListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPetListBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
//        val inflate = inflater.inflate(R.layout.fragment_pet_list, container, false)

        val listData = mutableListOf<Pet>()
//        listData.add(Pet("dog1", R.drawable.dog1, "dog"))
//        listData.add(Pet("background", R.drawable.background1, "dog and cat"))

        val adapter = PetListAdapter(listData)
//        val rv: RecyclerView = inflate.findViewById(R.id.rvPetList)
        binding.rvPetList.adapter = adapter
        binding.rvPetList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        binding.btnAdd.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_petListFragment_to_petInforFragment)
        }

//        return inflater.inflate(R.layout.fragment_pet_list, container, true) -> *can't used in main
        return binding.root // *but it
    }

}