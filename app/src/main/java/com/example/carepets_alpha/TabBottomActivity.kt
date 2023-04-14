package com.example.carepets_alpha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.carepets_alpha.bottom_navigation.ViewPagerAdapter
import com.example.carepets_alpha.databinding.ActivityTabBottomBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class TabBottomActivity : AppCompatActivity() {

    lateinit var binding: ActivityTabBottomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTabBottomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        binding.viewPager.adapter = adapter

        binding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        binding.bottomNavigation.menu.findItem(R.id.home).isChecked = true
                    }
                    1 -> {
                        binding.bottomNavigation.menu.findItem(R.id.note).isChecked = true
                    }
                    2 -> {
                        binding.bottomNavigation.menu.findItem(R.id.reminder).isChecked = true
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {
                TODO("Not yet implemented")
            }

        })
        binding.bottomNavigation.setOnNavigationItemReselectedListener(object : BottomNavigationView.OnNavigationItemReselectedListener {
            override fun onNavigationItemReselected(item: MenuItem) {
                when (item.getItemId())  {
                    R.id.home -> binding.viewPager.setCurrentItem(0)
                    R.id.note -> binding.viewPager.setCurrentItem(1)
                    R.id.reminder -> binding.viewPager.setCurrentItem(2)

                }
            }
        })
    }
}
