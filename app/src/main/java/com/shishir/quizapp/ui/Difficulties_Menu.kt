package com.shishir.quizapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shishir.quizapp.R
import com.shishir.quizapp.utils.Constants

class Difficulties_Menu : AppCompatActivity() {
    private lateinit var newbie: Button
    private lateinit var amature: Button
    private lateinit var expert: Button
    private lateinit var master: Button
    private lateinit var grandmaster: Button
    private var timeSelector: Int = 0
    private lateinit var categorySelector: String
    private lateinit var userName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_difficulties_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        newbie = findViewById(R.id.newbie)
        amature = findViewById(R.id.amature)
        expert = findViewById(R.id.expert)
        master = findViewById(R.id.master)
        grandmaster = findViewById(R.id.grandmaster)

        if (intent.hasExtra(Constants.USERNAME)) {
            userName = intent.getStringExtra(Constants.USERNAME)!!
        }
        categorySelector = intent.getStringExtra(Constants.CATEGORYSELCTOR)!!
        newbie.setOnClickListener {
            timeSelector = 45
            goNext()
        }
        amature.setOnClickListener {
            timeSelector = 30
            goNext()
        }
        expert.setOnClickListener {
            timeSelector = 20
            goNext()
        }
        master.setOnClickListener {
            timeSelector = 12
            goNext()
        }
        grandmaster.setOnClickListener {
            timeSelector = 8
            goNext()
        }
    }

    private fun goNext() {
        Intent(this@Difficulties_Menu, QuestionsActivity::class.java).also {
            it.putExtra(Constants.CATEGORYSELCTOR, categorySelector)
            it.putExtra(Constants.TIMESELCTOR, timeSelector.toString())
            it.putExtra(Constants.USERNAME, userName)
            startActivity(it)
            finish()
        }
    }
}