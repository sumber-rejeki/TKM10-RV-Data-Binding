package com.example.rvbinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rvbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Info>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.recyclerView.setHasFixedSize(true)

        list = ArrayList()
        list.add(Info(R.drawable.img,"Natural"))
        list.add(Info(R.drawable.img_1,"Road"))
        list.add(Info(R.drawable.img_2,"Sunset"))
        list.add(Info(R.drawable.img_3,"Dragon"))

        adapter = Adapter(list)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}