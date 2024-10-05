package dev.alexisvillarruel.logingpcparcial_reciclyeview.ui.reciclevw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.alexisvillarruel.logingpcparcial_reciclyeview.R
import dev.alexisvillarruel.logingpcparcial_reciclyeview.ui.adapter.ItemAdapter
import dev.alexisvillarruel.logingpcparcial_reciclyeview.ui.model.exmModel

class recyclevwFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recyclevw, container, false)
        val rvrecycle : RecyclerView = view.findViewById(R.id.rvRecycle)
        rvrecycle.layoutManager = LinearLayoutManager(requireContext())
        rvrecycle.adapter = ItemAdapter(getItem())
        return view
    }
    private fun getItem(): List<exmModel>{
        val itemlist: ArrayList<exmModel> = ArrayList()
        itemlist.add(
            exmModel(1,R.drawable.gal,"Galaxia","abcdef)"
        ))
        itemlist.add(
            exmModel(2,R.drawable.gala,"Andromeda","abcdef"))
        itemlist.add(
            exmModel(3,R.drawable.galaxia1,"galaxia 3","abcdef"))
        return itemlist
    }
}