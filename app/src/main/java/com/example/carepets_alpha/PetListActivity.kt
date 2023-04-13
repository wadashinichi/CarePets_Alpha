package com.example.carepets_alpha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.carepets_alpha.database.Pet
import com.example.carepets_alpha.database.PetRepository
import com.example.carepets_alpha.databinding.ActivityMainBinding
import com.example.carepets_alpha.databinding.ActivityPetListBinding

class PetListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPetListBinding
    private lateinit var res: PetRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPetListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        res = PetRepository(application)
        binding.btnSubmit.setOnClickListener {
            addPet()
        }

    }
    fun addPet() {
        val name: String = binding.editName.text.toString()
        val birth: String = binding.editBirth.text.toString()
        val species: String = binding.editSpecies.text.toString()
        val pet: Pet = Pet(0, name, 0)
        res.insert(pet)
        Toast.makeText(this, "added a new pet", Toast.LENGTH_SHORT)
        var i: Intent = Intent()
        i.setClass(this, MainActivity::class.java)
        startActivity(i)
    }
}