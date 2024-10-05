package dev.alexisvillarruel.logingpcparcial_reciclyeview.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.alexisvillarruel.logingpcparcial_reciclyeview.R
import dev.alexisvillarruel.logingpcparcial_reciclyeview.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_slideshow, container, false)
        val km: TextView = view.findViewById(R.id.etkilometros)
        val min: TextView = view.findViewById(R.id.etminutos)
        val result : TextView = view.findViewById(R.id.msgcalculo)
        val btnCalcular: Button = view.findViewById(R.id.btncalcular)
        btnCalcular.setOnClickListener{
            val kmText: String = km.text.toString()
            val minText: String = min.text.toString()
            result.text = (kmText.toFloat() / minText.toFloat()).toString() + " Km/min"
        }
        return view
    }
}

