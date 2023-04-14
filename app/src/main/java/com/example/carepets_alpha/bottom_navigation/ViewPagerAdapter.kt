package com.example.carepets_alpha.bottom_navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.carepets_alpha.medicalbook.main.NoteFragment
import com.example.carepets_alpha.reminder.ReminderFragment
import com.example.carepets_alpha.ui.home.HomeFragment

class ViewPagerAdapter(fm: FragmentManager, behavior: Int) :
    FragmentStatePagerAdapter(fm, behavior) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> NoteFragment()
            else -> ReminderFragment()
        }
    }

}