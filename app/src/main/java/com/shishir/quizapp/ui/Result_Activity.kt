package com.shishir.quizapp.ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.firestore.FirebaseFirestore
import com.shishir.quizapp.R
import com.shishir.quizapp.utils.Constants

class Result_Activity : AppCompatActivity() {
    private lateinit var uName: TextView
    private lateinit var score: TextView
    private lateinit var submission: TextView
    private lateinit var finish: Button
    private val CANDIDATENAME = "CANDIDATE NAME"
    private val CANDIDATESCORE = "TOTAL SCORE"
    private lateinit var scoreTotal: String
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        uName = findViewById(R.id.uname)
        score = findViewById(R.id.score)
        finish = findViewById(R.id.resultBtn)
        submission = findViewById(R.id.submission)
        if (intent.hasExtra(Constants.USERNAME)) {
            uName.text = intent.getStringExtra(Constants.USERNAME)!!
        }
        score.text = "Your Score is ${intent.getStringExtra(Constants.SCORE)} out of ${
            intent.getStringExtra(Constants.TOTALQUEST)
        }"
        scoreTotal =
            "${intent.getStringExtra(Constants.SCORE)} out of ${intent.getStringExtra(Constants.TOTALQUEST)}"
        finish.setOnClickListener {
            Log.d("ResultActivity", "Finish button clicked")
            saveToDataBase()
        }

    }

    private fun saveToDataBase() {
        val uNameData = uName.text.toString()
        val saveData = mutableMapOf<String, Any>()
        saveData.put(CANDIDATENAME, uNameData)
        saveData.put(CANDIDATESCORE, scoreTotal)

        db.collection("Candidate_Data").document().set(saveData)
            .addOnSuccessListener {
                submission.text = getString(R.string.submission_successfully)
            }.addOnFailureListener { e ->
                submission.text = getString(R.string.error_submission_failed)
            }
    }
}