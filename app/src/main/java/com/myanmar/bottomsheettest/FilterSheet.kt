package com.myanmar.bottomsheettest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.myanmar.bottomsheettest.ui.home.HomeFragment
import java.util.concurrent.ThreadPoolExecutor

class FilterSheet : BottomSheetDialogFragment() {

    val home = HomeFragment()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.filter, container, false)
        val one = view.findViewById<TextView>(R.id.one)
        val two = view.findViewById<TextView>(R.id.two)
        val three = view.findViewById<TextView>(R.id.three)

        one.setOnClickListener {
            home.setData("One")
            dismiss()
        }

        two.setOnClickListener {
            home.setData("Two")
            dismiss()
        }

        three.setOnClickListener {
            home.setData("Three")
            dismiss()
        }
        return view
    }
}