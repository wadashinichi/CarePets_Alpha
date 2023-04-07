package com.example.carepets_alpha.petlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carepets_alpha.MainActivity
import com.example.carepets_alpha.R
import com.example.carepets_alpha.database.Pet

class PetListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflate = inflater.inflate(R.layout.fragment_pet_list, container, false)

        val listData = mutableListOf<Pet>()
        listData.add(
            Pet("dog1", R.drawable.dog1, "dog")
        )
        listData.add(Pet("background", R.drawable.background1, "dog and cat"))

        val adapter = PetListAdapter(listData)
        val rv: RecyclerView = inflate.findViewById(R.id.rvPetList)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(inflate.context, LinearLayoutManager.VERTICAL, false)

        return inflater.inflate(R.layout.fragment_pet_list, container, false)
    }

}