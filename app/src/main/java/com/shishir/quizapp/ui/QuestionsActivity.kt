package com.shishir.quizapp.ui

import android.content.Intent
import android.graphics.BitmapFactory.Options
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shishir.quizapp.R
import com.shishir.quizapp.model.Questions
import com.shishir.quizapp.utils.Constants
import kotlinx.coroutines.selects.select
import java.util.LinkedList
import kotlin.random.Random

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var progressBar: ProgressBar
    private lateinit var trackPro: TextView
    private lateinit var question: TextView
    private lateinit var opt1: TextView
    private lateinit var opt2: TextView
    private lateinit var opt3: TextView
    private lateinit var opt4: TextView
    private var questionCounter = 1
    private lateinit var questionsList: MutableList<Questions>
    private var selectedAns = 0
    private lateinit var checkBtn: Button
    private lateinit var currentQuest: Questions
    private var answered = false
    private lateinit var userName: String
    private var score = 0
    private val askedQuestions = mutableListOf<Int>()
    private lateinit var questionsTimer: TextView
    private var countDownTimer: CountDownTimer? = null
    private var categorySelector: String = "0"
    private var questionStarting: Int = 0
    private var questionsEnding: Int = 0
    private lateinit var categoryQst: TextView
    private var countTotal: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_questions)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        checkBtn = findViewById(R.id.check)
        progressBar = findViewById(R.id.progressBar)
        trackPro = findViewById(R.id.trackPro)
        question = findViewById(R.id.questionTest)
        opt1 = findViewById(R.id.opt1)
        opt2 = findViewById(R.id.opt2)
        opt3 = findViewById(R.id.opt3)
        opt4 = findViewById(R.id.opt4)
        questionsTimer = findViewById(R.id.questionTimer)
        categoryQst = findViewById(R.id.category)
        opt1.setOnClickListener(this)
        opt2.setOnClickListener(this)
        opt3.setOnClickListener(this)
        opt4.setOnClickListener(this)
        checkBtn.setOnClickListener(this)
        askedQuestions.add(0)
        if (intent.hasExtra(Constants.USERNAME)) {
            userName = intent.getStringExtra(Constants.USERNAME)!!
        }
        categorySelector = intent.getStringExtra(Constants.CATEGORYSELCTOR)!!
        if (categorySelector == "1") {
            questionsList = Constants.getbasicQuestions()
            questionStarting = 1
            questionsEnding = 22
            categoryQst.text = "Basic"
        } else if (categorySelector == "2") {
            questionsList = Constants.getdsQuestions()
            questionStarting = 1
            questionsEnding = 22
            categoryQst.text = "Data Structure"
        } else if (categorySelector == "3") {
            questionsList = Constants.getalgorithmQuestions()
            questionStarting = 1
            questionsEnding = 22
            categoryQst.text = "Algorithm"
        } else if (categorySelector == "4") {
            questionsList = Constants.getseQuestions()
            questionStarting = 1
            questionsEnding = 22
            categoryQst.text = "Object Oriented Programming"
        } else if (categorySelector == "5") {
            questionsList = Constants.getdbQuestions()
            questionStarting = 1
            questionsEnding = 22
            categoryQst.text = "Database"
        } else {
            questionsList = Constants.getRandQuest()
            questionStarting = 1
            questionsEnding = 22
            categoryQst.text = "Random Pick"
        }
        nxtQuestion()
    }

    private fun gRand(qS: Int, qE: Int): Int {
        val randomQuestion = Random.nextInt(qS, qE)
        return randomQuestion
    }

    private fun nxtQuestion() {
        countDownTimer?.cancel()
        countDownTimer = null
        var randomQuestion = 0
        do {
            randomQuestion = gRand(questionStarting, questionsEnding)
        } while (askedQuestions.contains(randomQuestion))

        askedQuestions.add(randomQuestion)
        if (questionCounter <= 20) {
            checkBtn.text = getString(R.string.check)
            currentQuest = questionsList[randomQuestion]

            resetOptions()
            val quest = currentQuest
            progressBar.progress = questionCounter
            trackPro.text = "$questionCounter/${progressBar.max}"
            question.text = quest.question
            opt1.text = quest.option1
            opt2.text = quest.option2
            opt3.text = quest.option3
            opt4.text = quest.option4
            questionCounter++
            startTimer()
        } else {
            countDownTimer?.cancel()
            countDownTimer = null
            Intent(this@QuestionsActivity, Result_Activity::class.java).also {
                it.putExtra(Constants.USERNAME, userName)
                it.putExtra(Constants.SCORE, score.toString())
                it.putExtra(Constants.TOTALQUEST, (questionCounter - 1).toString())
                startActivity(it)
                finish()
            }
        }
        answered = false
    }

    private fun startTimer() {
        if (countDownTimer == null) {
            countDownTimer = object : CountDownTimer(11000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    questionsTimer.text = "Time Left: ${millisUntilFinished / 1000}"
                }

                override fun onFinish() {
                    nxtQuestion()
                }
            }.start()
        }

    }

    private fun resetOptions() {
        val options = mutableListOf<TextView>()
        options.add(opt1)
        options.add(opt2)
        options.add(opt3)
        options.add(opt4)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.optionborder)
        }
    }

    private fun selectedOptn(txtView: TextView, SelectOptNum: Int) {
        resetOptions()
        selectedAns = SelectOptNum
        txtView.setTextColor(Color.parseColor("#363A43"))
        txtView.setTypeface(txtView.typeface, Typeface.BOLD)
        txtView.background = ContextCompat.getDrawable(this, R.drawable.selectedborder)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.opt1 -> {
                selectedOptn(opt1, 1)
            }

            R.id.opt2 -> {
                selectedOptn(opt2, 2)
            }

            R.id.opt3 -> {
                selectedOptn(opt3, 3)
            }

            R.id.opt4 -> {
                selectedOptn(opt4, 4)
            }

            R.id.check -> {
                if (!answered) {
                    checkAns()
                } else {
                    nxtQuestion()
                }
                selectedAns = 0
            }
        }
    }

    private fun checkAns() {
        answered = true
        if (selectedAns == 0) {
            Toast.makeText(this@QuestionsActivity, "Please Select an Option!", Toast.LENGTH_SHORT)
                .show()
        } else {
            if (selectedAns == currentQuest.correctAns) {
                score++
                showCorr()
            } else {
                when (selectedAns) {
                    1 -> {
                        opt1.background = ContextCompat.getDrawable(this, R.drawable.colorred)
                    }

                    2 -> {
                        opt2.background = ContextCompat.getDrawable(this, R.drawable.colorred)
                    }

                    3 -> {
                        opt3.background = ContextCompat.getDrawable(this, R.drawable.colorred)
                    }

                    4 -> {
                        opt4.background = ContextCompat.getDrawable(this, R.drawable.colorred)
                    }
                }

            }
            checkBtn.text = getString(R.string.next)
            showCorAns()
        }
    }

    private fun showCorAns() {
        selectedAns = currentQuest.correctAns
        showCorr()
    }

    private fun showCorr() {
        when (selectedAns) {
            1 -> {
                opt1.background = ContextCompat.getDrawable(this, R.drawable.correctborder)
                opt1.setTextColor(Color.WHITE)
            }

            2 -> {
                opt2.background = ContextCompat.getDrawable(this, R.drawable.correctborder)
                opt2.setTextColor(Color.WHITE)
            }

            3 -> {
                opt3.background = ContextCompat.getDrawable(this, R.drawable.correctborder)
                opt3.setTextColor(Color.WHITE)
            }

            4 -> {
                opt4.background = ContextCompat.getDrawable(this, R.drawable.correctborder)
                opt4.setTextColor(Color.WHITE)
            }
        }
    }
}