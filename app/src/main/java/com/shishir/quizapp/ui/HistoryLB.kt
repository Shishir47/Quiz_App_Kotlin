package com.shishir.quizapp.ui

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.firestore.FirebaseFirestore
import com.shishir.quizapp.R

class HistoryLB : AppCompatActivity() {
    private lateinit var showScores: TextView
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_history_lb)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left,systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showScores = findViewById(R.id.showScores)
        showScore()
    }

    private fun showScore() {
        db.collection("Candidate_Data").get()
            .addOnSuccessListener { querySnapshot ->
                val scores = StringBuilder()
                for (document in querySnapshot) {
                    val candidateName = document.getString("CANDIDATE NAME") ?: ""
                    val candidateScore = document.getString("TOTAL SCORE") ?: ""
                    val category = document.getString("CATEGORY NAME") ?: ""
                    val difficulty = document.getString("DIFFICULTY") ?: ""

                    scores.append("Name: $candidateName\n")
                    scores.append("Score: $candidateScore\n")
                    scores.append("Category: $category\n")
                    scores.append("Difficulty: $difficulty\n\n")
                }
                showScores.text = scores.toString()
            }
            .addOnFailureListener { exception ->
                showScores.text = "Error fetching scores: ${exception.message}"
            }}
}