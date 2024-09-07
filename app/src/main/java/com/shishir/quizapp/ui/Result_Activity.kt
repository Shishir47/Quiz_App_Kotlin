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
    private val CATEGORYSELCTOR = "CATEGORY NAME"
    private val DIFFSELECTOR = "DIFFICULTY"
    private var diffType=" "
    private var catg=" "
    private var percentageScore: Double= 0.0
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
        diffType= intent.getStringExtra(Constants.DIFFSELECTOR)!!
        catg= intent.getStringExtra(Constants.CATEGORYSELCTOR)!!
        if (intent.hasExtra(Constants.USERNAME)) {
            uName.text = ("Name: ${intent.getStringExtra(Constants.USERNAME)!!}\nCategory: $catg \n" +
                    "Difficulty: $diffType")
        }

        val value:Double= (intent.getStringExtra(Constants.SCORE)!!).toDouble()
        val tValue:Double= (intent.getStringExtra(Constants.TOTALQUEST)!!).toDouble()
        percentageScore= ((value/tValue)*100)
        score.text = "You Scored ${this.percentageScore}%"
        scoreTotal = "${percentageScore}% out of ${intent.getStringExtra(Constants.TOTALQUEST)} Questions"
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
        saveData.put(DIFFSELECTOR, diffType)


        db.collection("Candidate_Data").document(uNameData).set(saveData)
            .addOnSuccessListener {
                submission.text = getString(R.string.submission_successfully)
            }.addOnFailureListener { e ->
                submission.text = getString(R.string.error_submission_failed)
            }
    }
}