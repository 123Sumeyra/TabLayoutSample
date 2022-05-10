package com.sum.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.sum.tablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var tabLayout : TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tabLayout = binding.tabs



        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                println("onTabSelected")

                // this part will automatically called

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                println("onTabUnselected")

            }

            override fun onTabReselected(tab: TabLayout.Tab?) { // iki kere aynı table basarsan ne olacak
                println("onTabReselected")


            }




        })



    }



    }