package com.shishir.quizapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shishir.quizapp.R
import com.shishir.quizapp.utils.Constants

class Questions_Categories : AppCompatActivity() {
    private lateinit var basic: Button
    private lateinit var ds: Button
    private lateinit var algorithm: Button
    private lateinit var oop: Button
    private lateinit var db: Button
    private lateinit var random: Button
    private var categorySelector: Int = 0
    private lateinit var userName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.question_categories)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        basic = findViewById(R.id.basic)
        ds = findViewById(R.id.ds)
        algorithm = findViewById(R.id.algorithm)
        oop = findViewById(R.id.oop)
        db = findViewById(R.id.db)
        random = findViewById(R.id.random)
        if (intent.hasExtra(Constants.USERNAME)) {
            userName = intent.getStringExtra(Constants.USERNAME)!!
        }
        basic.setOnClickListener {
            categorySelector = 1
            goNext()
        }
        ds.setOnClickListener {
            categorySelector = 2
            goNext()
        }
        algorithm.setOnClickListener {
            categorySelector = 3
            goNext()
        }
        oop.setOnClickListener {
            categorySelector = 4
            goNext()
        }
        db.setOnClickListener {
            categorySelector = 5
            goNext()
        }
        random.setOnClickListener {
            categorySelector = 6
            goNext()
        }
    }

    private fun goNext() {
        Intent(this@Questions_Categories, QuestionsActivity::class.java).also {
            it.putExtra(Constants.CATEGORYSELCTOR, categorySelector.toString())
            it.putExtra(Constants.USERNAME, userName)
            startActivity(it)
            finish()
        }
    }
}