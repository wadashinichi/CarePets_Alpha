package com.example.carepets_alpha.medicalbook.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.carepets_alpha.R
import com.example.carepets_alpha.medicalbook.OverViewFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3,
    R.string.tab_text_4
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> OverViewFragment()
            1 -> VaccinationFragment()
            2 -> PrescriptionFragment()
            else -> NoteFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String = when (position) {
            0 -> "Overview"
            1 -> "Vaccination"
            2 -> "Prescription"
            else -> "Note"
        }
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 4
    }
}