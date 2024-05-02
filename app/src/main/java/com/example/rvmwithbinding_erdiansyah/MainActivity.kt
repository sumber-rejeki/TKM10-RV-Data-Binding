package com.example.rvmwithbinding_erdiansyah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rvmwithbinding_erdiansyah.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Info>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.recyclerView3.setHasFixedSize(true)

        list = ArrayList()
        list.add(Info(R.drawable.avengers, name = "Avengers"))
        list.add(Info(R.drawable.eternal, name = "Eternal"))
        list.add(Info(R.drawable.meg, name = "The Meg"))
        list.add(Info(R.drawable.peaky, name = "Peaky Blinders"))

        adapter = Adapter(list)
        binding.recyclerView3.adapter = adapter
        binding.recyclerView3.layoutManager = LinearLayoutManager(this)

    }
}