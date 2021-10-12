package com.anggapambudi.counterapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.anggapambudi.counterapp.R
import com.anggapambudi.counterapp.databinding.ActivityMainBinding
import com.anggapambudi.counterapp.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModels: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        //setViewModel
        binding.viewModel = viewModels

    }


//    private fun increaseCounter() {
//        counter += 1
//        binding.textNumber.text = "$counter"
//    }
//
//    private fun decreaseCounter() {
//        counter -= 1
//        binding.textNumber.text = "$counter"
//    }
//
//    fun onClick(view: View) {
//        when (view) {
//            binding.btnMin -> decreaseCounter()
//            binding.btnPlus -> increaseCounter()
//        }
//    }
}