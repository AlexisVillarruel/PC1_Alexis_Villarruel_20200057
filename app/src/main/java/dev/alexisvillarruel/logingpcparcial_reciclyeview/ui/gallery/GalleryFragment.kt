package dev.alexisvillarruel.logingpcparcial_reciclyeview.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.alexisvillarruel.logingpcparcial_reciclyeview.R
import dev.alexisvillarruel.logingpcparcial_reciclyeview.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {
    var arrSo = arrayOf("Manchester United", "Real Madrid", "PSG", "Bayern Munich",)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_gallery, container, false)
        val lista : ListView = view.findViewById(R.id.lstequipos)

        val adapter: Any?=
            ArrayAdapter<Any>(this.requireContext(), android.R.layout.simple_list_item_1, arrSo)
            lista.adapter = adapter as ArrayAdapter<*>?

        return view
        }

    }