package com.example.carepets_alpha.petinfor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.room.Room
import com.example.carepets_alpha.R
import com.example.carepets_alpha.database.Pet
import com.example.carepets_alpha.database.PetDao
import com.example.carepets_alpha.database.PetsDatabase
import com.example.carepets_alpha.databinding.FragmentPetInforBinding


class PetInforFragment : Fragment() {

    private lateinit var binding: FragmentPetInforBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPetInforBinding.inflate(layoutInflater)

//        val db = Room.databaseBuilder(
//            inflater.context, AppDatabase::class.java, "AppDatabase"
//        ).build()

        val db: PetsDatabase = Room.databaseBuilder(inflater.context, PetsDatabase::class.java, "pet_database")
            .build()
//        val petDao: PetDao

        binding.btnSubmit.setOnClickListener {
            val name: String = binding.editName.text.toString()
            val birth: String = binding.editBirth.text.toString()
            val species: String = binding.editSpecies.text.toString()
            val pet: Pet = Pet(0, name, 0)
//            view.findNavController().navigate(R.id.action_petInforFragment_to_petListFragment)
//            val insert = petDao.insertPet(pet)
//            val list: List<Pet> = petDao.getAll()
//            Toast.makeText(context, list.first().toString(), Toast.LENGTH_SHORT).show()
//            if (container != null) {
//                PetsDatabase.getInstance(container.context).petDao().insertPet(pet)
//            }

        }

        return binding.root

    }

}