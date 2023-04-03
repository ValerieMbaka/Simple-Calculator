package com.example.midmorningsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Instantiate the user interface elements
    lateinit var mAnswer:TextView
    lateinit var mFnum:EditText
    lateinit var mSnum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mDiv:Button
    lateinit var mMul:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer = findViewById(R.id.mTvAnswer)
        mFnum = findViewById(R.id.mEdtFnum)
        mSnum = findViewById(R.id.mEdtSnum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnSub)
        mMul = findViewById(R.id.mBtnMul)
        mDiv = findViewById(R.id.mBtnDiv)
        // Set onClick listeners to buttons
        mAdd.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                // Display the answer on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                // Display the answer on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                // Display the answer on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                // Display the answer on the textView answer
                mAnswer.text = jibu.toString()
            }
        }
    }
}