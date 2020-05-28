package com.example.ciceroneexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_fragment2.*

/**
 * A simple [Fragment] subclass.
 */
class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_fragment2, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_add.setOnClickListener {

            //findNavController().navigate(R.id.fragment4)

            Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment4)
        }

        btn_open.setOnClickListener {
          //  findNavController().navigate(R.id.fragment3)
            Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment3)
            }
        }

}
