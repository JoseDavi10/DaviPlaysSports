package com.example.daviplays

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class AddMatchFragment : DialogFragment() {

    private lateinit var etTeamA: EditText
    private lateinit var etTeamB: EditText
    private lateinit var etDate: EditText
    private lateinit var btnSaveMatch: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_match, container, false)

        etTeamA = view.findViewById(R.id.etTeamA)
        etTeamB = view.findViewById(R.id.etTeamB)
        etDate = view.findViewById(R.id.etDate)
        btnSaveMatch = view.findViewById(R.id.btnSaveMatch)

        btnSaveMatch.setOnClickListener {
            val match = Match(
                teamA = etTeamA.text.toString(),
                teamB = etTeamB.text.toString(),
                date = etDate.text.toString()
            )

            (activity as MainActivity).addMatch(match)
            dismiss()
        }

        return view
    }
}
}