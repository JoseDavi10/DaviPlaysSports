package com.example.daviplays

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MatchAdapter
    private lateinit var btnAddMatch: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        btnAddMatch = findViewById(R.id.btnAddMatch)

        // Configurar RecyclerView
        adapter = MatchAdapter(listOf()) { match ->
            val intent = Intent(this, MatchDetailActivity::class.java)
            intent.putExtra("MATCH", match)
            startActivity(intent)
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        btnAddMatch.setOnClickListener {
            val fragment = AddMatchFragment()
            fragment.show(supportFragmentManager, "addMatch")
        }
    }
}

class MatchDetailActivity {

}
