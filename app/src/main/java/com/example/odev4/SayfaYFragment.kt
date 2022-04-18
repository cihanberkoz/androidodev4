package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentSayfaYBinding
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class SayfaYFragment : Fragment() {

    private lateinit var tasarim:FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentSayfaYBinding.inflate(inflater,container,false)

        tasarim.buttonGeri.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayaEkraninaGecis)
        }


        return tasarim.root
    }

    /*
    override fun onBackPressed() {
    super.onBackPressed()
    }
    */
}