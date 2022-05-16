package com.sum.tablayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout

import com.google.android.material.tabs.TabLayoutMediator
import com.sum.tablayout.databinding.ActivityTabBinding


class TabActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTabBinding
    private lateinit var tabLayout : TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)



        binding = ActivityTabBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tabLayout = binding.tabs

        val titleList = arrayListOf("PAGE1", "PAGE2")

        val adapter = TabAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
            tab.text = titleList[position]
        }.attach()

    }
}