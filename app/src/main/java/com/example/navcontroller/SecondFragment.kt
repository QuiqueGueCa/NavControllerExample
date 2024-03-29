package com.example.navcontroller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SecondFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fargment_second, container, false)

        val btnNav = root.findViewById<Button>(R.id.btnNav)

        btnNav.setOnClickListener {
            findNavController()
                .navigate(SecondFragmentDirections
                    .actionSecondFragmentToThirdFragment(
                        name = "Manolo")
                )
        }

        return root
    }
}