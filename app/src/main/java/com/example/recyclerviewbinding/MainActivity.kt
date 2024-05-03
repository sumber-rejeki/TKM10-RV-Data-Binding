package com.example.recyclerviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Info>
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)

        list = ArrayList()
        list.add(Info(R.drawable.siksakubur, "Siksa Kubur"))
        list.add(Info(R.drawable.agaklaen, "Agak Laen"))
        list.add(Info(R.drawable.buyahamka, "Buya Hamka"))
        list.add(Info(R.drawable.pasutrigaje, "Pasutri Gaje"))

        adapter = Adapter(list)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
