package com.example.databinding

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: Adapter
    private lateinit var list:ArrayList<Info>

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)

        list= ArrayList()
        list.add(Info(R.drawable.human, "Human Book"))
        list.add(Info(R.drawable.math, "Math Book"))
        list.add(Info(R.drawable.psikotes, "Psikotes Book"))
        list.add(Info(R.drawable.self, "Self Improve Book"))

        adapter = Adapter(list)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}