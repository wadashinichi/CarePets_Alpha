package com.example.carepets_alpha.petlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.carepets_alpha.R
import com.example.carepets_alpha.database.Pet
import com.example.carepets_alpha.database.PetsDatabase
import com.example.carepets_alpha.databinding.FragmentPetListBinding

class PetListFragment : Fragment(R.layout.fragment_pet_list) {

    private lateinit var binding: FragmentPetListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPetListBinding.inflate(layoutInflater)
        //// Inflate the layout for this fragment
///        val inflate = inflater.inflate(R.layout.fragment_pet_list, container, false)
//        var listData = mutableListOf<Pet>()
//        listData.add(Pet(0,"dog1", R.drawable.dog1, "dog"))
//        listData.add(Pet(0,"background", R.drawable.background1, "dog and cat"))
        var listData: List<Pet> = PetsDatabase.getInstance(inflater.context).petDao().getAll()

        val adapter = PetListAdapter(listData)
        binding.rvPetList.adapter = adapter
        binding.rvPetList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        binding.btnAdd.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_petListFragment_to_petInforFragment)
//            val navHostFragment = supportFragmentManager
        }

//        return inflater.inflate(R.layout.fragment_pet_list, container, true) -> *can't used in main

//        val application = requireNotNull(this.activity).application
//        val dtSource = AppDatabase.getInstance(application).petDao
//        val viewModelFactory = PetInforViewModelFactory(dtSource, application)
//        val petInforViewModel = ViewModelProvider(this, viewModelFactory).get(PetInforViewModel::class.java)

        return binding.root // *but it
    }

}