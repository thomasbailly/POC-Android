package com.example.poc_android.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.poc_android.R

class Page1 : Fragment() {

    private lateinit var page1ViewModel: Page1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        page1ViewModel =
                ViewModelProvider(this).get(Page1ViewModel::class.java)
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_page1, container, false)
        val title: TextView = root.findViewById(R.id.text_title)
        val btnHome: Button = root.findViewById(R.id.btn_home)
        btnHome.setOnClickListener { findNavController().navigate(R.id.action_page1_to_navigation_home) }
        page1ViewModel.text.observe(viewLifecycleOwner, {
            title.text = it
        })
        return root

    }

}