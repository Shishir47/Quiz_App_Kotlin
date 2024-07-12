package com.shishir.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.shishir.quizapp.databinding.ActivityMainBinding
import com.shishir.quizapp.ui.QuestionsActivity
import com.shishir.quizapp.ui.Questions_Categories
import com.shishir.quizapp.utils.Constants

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*val startBtn: Button = findViewById(R.id.btnStart)
        val editTextName: EditText = findViewById(R.id.name)
        startBtn.setOnClickListener {
            if (editTextName.text.isNotEmpty()) {
                Intent(this@MainActivity, Questions_Categories::class.java).also {
                    it.putExtra(Constants.USERNAME, editTextName.text.toString())
                    startActivity(it)
                    finish()
                }
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "Please Enter Your Name to Start",
                    Toast.LENGTH_SHORT
                ).show()
            }
        } */
        binding.login.setOnClickListener {

        }
        binding.register.setOnClickListener {

        }
        binding.regup.setOnClickListener {
            binding.flipper.showNext()
        }
        binding.lgin.setOnClickListener {
            binding.flipper.showPrevious()
        }
    }
}