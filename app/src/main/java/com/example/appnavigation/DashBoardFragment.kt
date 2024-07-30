package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class DashBoardFragment : Fragment() {

    //Ekrani cizdirme olayi activity'de onCreate'de olur. Fragmnet'da ise onCreateView'da.
    // Fragment icinde de onCreate fonks vardir ama cizdirme islemi onCreateView'da olur.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dash_board, container, false)
    }

    //onViewCreated ise onCreateView'da ui'yini cizdirdiğimiz ekrani bize geri veriyor.
    // findViewById direkt olarak fragmwnt'larda bulunan bir ozellik degil. activitylerde bulunan bir ozellik.
    // fragment'da findViewById'ye view uzerinden erisiyorum.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btnOpenProfile = view.findViewById<Button>(R.id.btnOpenProfile)
        btnOpenProfile.setOnClickListener {
            //findNavController().navigate(R.id.action_dashBoardFragment_to_profileFragment)
            findNavController().navigate(R.id.profileFragment)
        }
    }

}