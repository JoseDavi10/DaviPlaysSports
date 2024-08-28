package com.example.daviplays

import androidx.appcompat.app.AppCompatActivity

class FavoriteMatchesActivity : AppCompatActivity {

    private lateinit var recyclerViewFavorites: RecyclerView
    private lateinit var adapter: MatchAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_matches)

        recyclerViewFavorites = findViewById(R.id.recyclerViewFavorites)

        val match = intent.getSerializableExtra("MATCH") as? Match
        val matches = match?.let { listOf(it) } ?: listOf()

        adapter = MatchAdapter(matches) {}
        recyclerViewFavorites.layoutManager = LinearLayoutManager(this)
        recyclerViewFavorites.adapter = adapter
    }
}
}