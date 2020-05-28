package com.example.ciceroneexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_fragment4.*

/**
 * A simple [Fragment] subclass.
 */
class Fragment4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_save.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment4_to_fragment3)
           // view.findNavController().navigate(R.id.action_fragment4_to_fragment3)
            //Navigation.createNavigateOnClickListener(R.id.action_fragment4_to_fragment3)
        }

    }


}
