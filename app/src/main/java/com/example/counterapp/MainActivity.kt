package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        tv_count.text = viewModel.num.toString()

        iv_plus.setOnClickListener {
            viewModel.plusNum()
            tv_count.text = viewModel.num.toString()
        }
        iv_minus.setOnClickListener {
            viewModel.minusNum()
            tv_count.text = viewModel.num.toString()
        }
        iv_reset.setOnClickListener {
            viewModel.resetNum()
            tv_count.text = viewModel.num.toString()
        }

    }
}