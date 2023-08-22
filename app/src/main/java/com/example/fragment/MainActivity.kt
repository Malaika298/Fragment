package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.ActivityMainBinding
import com.example.fragment.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bTnTime.setOnClickListener {

            replaceFrameWithFragment(ClockFragment())
        }

        binding.bTnExam.setOnClickListener {

            replaceFrameWithFragment(ExamFragment())
        }

        binding.bTnValidate.setOnClickListener {

            replaceFrameWithFragment(LoginFragment())
        }
    }

    private fun replaceFrameWithFragment(fragment: Fragment) {

        var fragmentManager = supportFragmentManager

        var fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frameLayout, fragment)

        fragmentTransaction.commit()
    }
}