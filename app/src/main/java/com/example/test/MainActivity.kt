package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFrag1.setOnClickListener{
            gotoFragment(Fragment1())
        }

        binding.buttonFrag2.setOnClickListener {
            gotoFragment(Fragment2())
        }
    }

    private fun gotoFragment(fragment:Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.FragmentContainer, fragment).commit()
    }
}