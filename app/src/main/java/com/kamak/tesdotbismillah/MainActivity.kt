package com.kamak.tesdotbismillah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kamak.tesdotbismillah.ui.galery.GalleryFragment
import com.kamak.tesdotbismillah.ui.home.HomeFragment
import com.kamak.tesdotbismillah.ui.profile.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val fragment = HomeFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openMainFragment()
        supportActionBar?.hide()

        menu_bottom.setItemSelected(R.id.home)
        menu_bottom.setOnItemSelectedListener {
            when (it) {

                R.id.home -> {
                    openMainFragment()
                }
                R.id.favorite -> {
                    val galleryFragment = GalleryFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, galleryFragment).commit()

                }
                R.id.person -> {
                    val profileFragment = ProfileFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, profileFragment).commit()
                    }
            }
        }
    }

    private fun openMainFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragment)
        transaction.commit()
    }
}