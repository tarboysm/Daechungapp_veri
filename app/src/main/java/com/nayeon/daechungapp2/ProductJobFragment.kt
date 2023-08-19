package com.nayeon.daechungapp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ProductJobFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_job, container, false)

        val product_support_btn: Button = view.findViewById(R.id.product_support_btn)




        product_support_btn.setOnClickListener {


            findNavController().navigate(R.id.product_support_fragment)
        }





        return view
    }
}