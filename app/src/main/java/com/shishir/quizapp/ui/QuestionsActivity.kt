package com.shishir.quizapp.ui

import android.graphics.BitmapFactory.Options
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shishir.quizapp.R
import com.shishir.quizapp.model.Questions
import com.shishir.quizapp.utils.Constants

class QuestionsActivity : AppCompatActivity() , View.OnClickListener{
    private lateinit var progressBar:ProgressBar
    private lateinit var trackPro:TextView
    private lateinit var question: TextView
    private lateinit var opt1: TextView
    private lateinit var opt2: TextView
    private lateinit var opt3: TextView
    private lateinit var opt4: TextView
    private val currentPos=1
    private lateinit var questionsList: MutableList<Questions>
    private val selectedPos=0
    private lateinit var checkBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_questions)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        checkBtn= findViewById(R.id.check)
        progressBar=findViewById(R.id.progressBar)
        trackPro=findViewById(R.id.trackPro)
        question=findViewById(R.id.questionTest)
        opt1=findViewById(R.id.opt1)
        opt2=findViewById(R.id.opt2)
        opt3=findViewById(R.id.opt3)
        opt4=findViewById(R.id.opt4)
        questionsList= Constants.getQuestions()
        setQuestion()
    }
    private fun setQuestion(){
        val quest=questionsList[currentPos-1]
        progressBar.progress=currentPos
        trackPro.text="$currentPos/${progressBar.max}"
        question.text=quest.question
        opt1.text=quest.option1
        opt2.text=quest.option2
        opt3.text=quest.option3
        opt4.text=quest.option4
        if(currentPos==questionsList.size){
            checkBtn.text= getString(R.string.finish)
        }
        else{
            checkBtn.text=getString(R.string.check)
        }
    }
    private fun resetOptions(){
        val options= mutableListOf<TextView>()
        options.add(opt1)
        options.add(opt2)
        options.add(opt3)
        options.add(opt4)

    }
    override fun onClick(view: View?) {
        when(view?.id){

        }
    }
}