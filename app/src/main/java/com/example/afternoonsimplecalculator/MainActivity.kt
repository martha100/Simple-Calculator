package com.example.afternoonsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Instantiate the elements on the user interface as variables
    lateinit var mAnswer: TextView
    lateinit var mFnum:EditText
    lateinit var msnum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mDiv:Button
    lateinit var mMul:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer = findViewById(R.id.mmm)
        mFnum = findViewById(R.id.mEdtfnum)
        msnum = findViewById(R.id.mEdt2num)
        mAdd = findViewById(R.id.mbtnadd)
        mSub = findViewById(R.id.mbtnsub)
        mDiv = findViewById(R.id.mbtndiv)
        mMul = findViewById(R.id.mbtnmul)
        //Set onclick listeners  on buttons
        mAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty()|| secondNumber.isEmpty()) {
                //Display an error message on textView answer
                mAnswer.text = "Please enter a valid number"
            }else{
                //Proceed to compute the numbers
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                //Display the result on textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mAdd.setOnClickListener {

        }
        mSub.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty()|| secondNumber.isEmpty()) {
                //Display an error message on textView answer
                mAnswer.text = "Please enter a valid number"
            }else{
                //Proceed to compute the numbers
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                //Display the result on textView answer
                mAnswer.text = jibu.toString()
            }


        }
        mDiv.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty()|| secondNumber.isEmpty()) {
                //Display an error message on textView answer
                mAnswer.text = "Please enter a valid number"
            }else{
                //Proceed to compute the numbers
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                //Display the result on textView answer
                mAnswer.text = jibu.toString()
            }

        }
        mMul.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty()|| secondNumber.isEmpty()) {
                //Display an error message on textView answer
                mAnswer.text = "Please enter a valid number"
            }else{
                //Proceed to compute the numbers
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                //Display the result on textView answer
                mAnswer.text = jibu.toString()
            }

        }
    }
}