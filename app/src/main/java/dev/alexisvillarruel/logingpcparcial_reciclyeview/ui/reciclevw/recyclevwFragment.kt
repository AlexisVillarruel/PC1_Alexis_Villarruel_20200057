package dev.alexisvillarruel.logingpcparcial_reciclyeview.ui.reciclevw

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.alexisvillarruel.logingpcparcial_reciclyeview.Login
import dev.alexisvillarruel.logingpcparcial_reciclyeview.MainActivity
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
        val btnreturn: Button = view.findViewById(R.id.button)
        btnreturn.setOnClickListener{
            val intent = Intent(requireContext(), Login::class.java)
            startActivity(intent)
        }
        return view
    }
    private fun getItem(): List<exmModel>{
        val itemlist: ArrayList<exmModel> = ArrayList()
        itemlist.add(
            exmModel(1,R.drawable.messi,"Messi","32",1990))
        itemlist.add(
            exmModel(2,R.drawable.cr7,"Cristiano","30",1991))
        itemlist.add(
            exmModel(3,R.drawable.neymar,"Neymar","31",1992))
        itemlist.add(
            exmModel(3,R.drawable.james,"James","29",1995))
        return itemlist
    }
}