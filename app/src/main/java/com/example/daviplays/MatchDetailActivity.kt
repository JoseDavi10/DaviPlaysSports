package com.example.daviplays

import androidx.appcompat.app.AppCompatActivity

class MatchDetailActivity <TextView, Button, Bundle, Match : Any> : AppCompatActivity() {

    private lateinit var tvMatchDetails: TextView
    private lateinit var btnFavorite: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match_detail)

        tvMatchDetails = findViewById(R.id.tvMatchDetails)
        btnFavorite = findViewById(R.id.btnFavorite)

        val match = intent.getSerializableExtra("MATCH") as Match
        tvMatchDetails.text = "Time A: ${match.teamA} vs Time B: ${match.teamB}\nData: ${match.date}"

        btnFavorite.setOnClickListener {
            val intent = android.content.Intent(this, FavoriteMatchesActivity::class.java)
            intent.putExtra("MATCH", match)
            startActivity(intent)
        }
    }

    private fun startActivity(intent: Intent) {
        TODO("Not yet implemented")
    }
}
}