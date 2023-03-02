package com.example.mysimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result: Float = 0f

        val display: EditText = findViewById(R.id.textView_input)
        val tv_operator: TextView = findViewById(R.id.textView_operator)
        val tv_result: TextView = findViewById(R.id.textView_result)

        val btn_zero: Button = findViewById(R.id.button_zero)
        val btn_one: Button = findViewById(R.id.button_one)
        val btn_two: Button = findViewById(R.id.button_two)
        val btn_three: Button = findViewById(R.id.button_three)
        val btn_four: Button = findViewById(R.id.button_four)
        val btn_five: Button = findViewById(R.id.button_five)
        val btn_six: Button = findViewById(R.id.button_six)
        val btn_seven: Button = findViewById(R.id.button_seven)
        val btn_eight: Button = findViewById(R.id.button_eight)
        val btn_nine: Button = findViewById(R.id.button_nine)
        val btn_point: Button = findViewById(R.id.button_point)
        val btn_add: Button = findViewById(R.id.button_add)
        val btn_subtract: Button = findViewById(R.id.button_subtract)
        val btn_multiply: Button = findViewById(R.id.button_multiply)
        val btn_divide: Button = findViewById(R.id.button_divide)
        val btn_equals: Button = findViewById(R.id.button_equals)

        display.setOnClickListener {
            if (getText(R.string.displays) == display.text) {
                display.setText("")
            }
        }
        btn_zero.setOnClickListener {
            if (display.text.toString() != "0") {
                val str = "${display.text}${getText(R.string.zero)}"
                display.setText(str)
            }
            TODO("Добавить 0.0")
        }
        btn_one.setOnClickListener {
            val str = "${display.text}${getText(R.string.one)}"
            display.setText(str)
        }
        btn_two.setOnClickListener {
            val str = "${display.text}${getText(R.string.two)}"
            display.setText(str)
        }
        btn_three.setOnClickListener {
            val str = "${display.text}${getText(R.string.three)}"
            display.setText(str)
        }
        btn_four.setOnClickListener {
            val str = "${display.text}${getText(R.string.four)}"
            display.setText(str)
        }
        btn_five.setOnClickListener {
            val str = "${display.text}${getText(R.string.five)}"
            display.setText(str)
        }
        btn_six.setOnClickListener {
            val str = "${display.text}${getText(R.string.six)}"
            display.setText(str)
        }
        btn_seven.setOnClickListener {
            val str = "${display.text}${getText(R.string.seven)}"
            display.setText(str)
        }
        btn_eight.setOnClickListener {
            val str = "${display.text}${getText(R.string.eight)}"
            display.setText(str)
        }
        btn_nine.setOnClickListener {
            val str = "${display.text}${getText(R.string.nine)}"
            display.setText(str)
        }
        btn_point.setOnClickListener {
            if (display.text.toString().indexOf('.') == -1) {
                val str = "${display.text}."
                display.setText(str)
            }
        }
        btn_add.setOnClickListener {
            print(display.text.toString())
            if (display.text.toString() != "") {
                result += display.text.toString().toFloat()
                tv_operator.text = getText(R.string.add)
                display.setText("")
                tv_result.text = "$result"
            }
        }
        btn_subtract.setOnClickListener {
            if (display.text.toString() != "") {
                result -= display.text.toString().toFloat()
                tv_operator.text = getText(R.string.subtract)
                display.setText("")
                tv_result.text = "$result"
            }
        }
        btn_multiply.setOnClickListener {
            if (display.text.toString() != "") {
                result *= display.text.toString().toFloat()
                tv_operator.text = getText(R.string.multiply)
                display.setText("")
                tv_result.text = "$result"
            }
        }
        btn_divide.setOnClickListener {
            if (display.text.toString() != "") {
                result /= display.text.toString().toFloat()
                tv_operator.text = getText(R.string.divide)
                display.setText("")
                tv_result.text = "$result"
            }
        }
        btn_equals.setOnClickListener {
            if (display.text.toString() != "") {
                result = display.text.toString().toFloat()
                tv_operator.text = getText(R.string.equals)
                tv_result.text = "$result"
                display.setText("")
            }
        }
    }
}
