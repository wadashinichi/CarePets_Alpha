package com.example.carepets_alpha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carepets_alpha.database.Pet
import com.example.carepets_alpha.databinding.ActivityMainBinding
import com.example.carepets_alpha.petlist.PetListAdapter
import com.example.carepets_alpha.petlist.PetListFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        replaceFragment(PetListFragment())

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.mainframe, fragment)
        fragmentTransaction.commit()
    }
}