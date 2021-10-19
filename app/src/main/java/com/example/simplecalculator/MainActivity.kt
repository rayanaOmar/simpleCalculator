package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val textView = findViewById<TextView>(R.id.textView)

        val button1 = findViewById<Button>(R.id.mutiplay)
        val button2 = findViewById<Button>(R.id.div)
        val button3 = findViewById<Button>(R.id.sudtract)
        val button4 = findViewById<Button>(R.id.summation)


        button1.setOnClickListener {
            val userEnter1 = editText1.text.toString().toFloat()
            val userEnter2 = editText2.text.toString().toFloat()
            val multi = userEnter1 * userEnter2

            textView.text = "The result is $multi"

        }
        button2.setOnClickListener {
            val userEnter1 = editText1.text.toString().toFloat()
            val userEnter2 = editText2.text.toString().toFloat()
            val div = userEnter1 / userEnter2

            textView.text = "The result is $div"

            editText1.text.clear()
            editText2.text.clear()
        }
        button3.setOnClickListener {
            val userEnter1 = editText1.text.toString().toFloat()
            val userEnter2 = editText2.text.toString().toFloat()
            val sub = userEnter1 - userEnter2

            textView.text = "The result is $sub"

            editText1.text.clear()
            editText2.text.clear()
        }
        button4.setOnClickListener {
            val userEnter1 = editText1.text.toString().toFloat()
            val userEnter2 = editText2.text.toString().toFloat()
            val sum = userEnter1 + userEnter2

            textView.text = "The result is $sum"

            editText1.text.clear()
            editText2.text.clear()
        }
    }
}