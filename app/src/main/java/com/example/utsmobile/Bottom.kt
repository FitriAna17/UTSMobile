package com.example.utsmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.utsmobile.fragment.exploreFragment
import com.example.utsmobile.fragment.homeFragment
import com.example.utsmobile.fragment.photolibraryFragment
import com.example.utsmobile.fragment.subscriptionFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Bottom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom)

        val homeFragment = homeFragment()
        val subscriptionFragment = subscriptionFragment()
        val exploreFragment = exploreFragment()
        val photo_libraryFragment = photolibraryFragment()

        makeCurrentFragmant(homeFragment)
        makeCurrentFragmant(exploreFragment)
        makeCurrentFragmant(subscriptionFragment)
        makeCurrentFragmant(photo_libraryFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.home -> makeCurrentFragmant(homeFragment)
                R.id.explore -> makeCurrentFragmant(exploreFragment)
                R.id.subsriptions -> makeCurrentFragmant(subscriptionFragment)
                R.id.photo_library -> makeCurrentFragmant(photo_libraryFragment)
            }

            true
    }

    }


    private fun makeCurrentFragmant(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav,fragment)
            commit()
        }
    }
}