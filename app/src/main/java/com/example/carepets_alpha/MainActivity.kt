package com.example.carepets_alpha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carepets_alpha.database.Pet
import com.example.carepets_alpha.databinding.ActivityMainBinding
import com.example.carepets_alpha.petinfor.PetInforFragment
import com.example.carepets_alpha.petlist.PetListAdapter
import com.example.carepets_alpha.petlist.PetListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        drawerLayout = binding.drawerLayout
//
//        val navController = findNavController(R.id.nav_host_fragment)
        replaceFragment(PetInforFragment())
//        NavigationUI.setupWithNavController(binding.navDrawer, navController)
//        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.mainframe, fragment)
        fragmentTransaction.commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_host_fragment)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}