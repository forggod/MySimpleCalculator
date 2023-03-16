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

        val display: EditText = findViewById(R.id.textView_input)
        val tvOperator: TextView = findViewById(R.id.textView_operator)
        val tvSecondDigit: TextView = findViewById(R.id.textView_result)

        val btnZero: Button = findViewById(R.id.button_zero)
        val btnOne: Button = findViewById(R.id.button_one)
        val btnTwo: Button = findViewById(R.id.button_two)
        val btnThree: Button = findViewById(R.id.button_three)
        val btnFour: Button = findViewById(R.id.button_four)
        val btnFive: Button = findViewById(R.id.button_five)
        val btnSix: Button = findViewById(R.id.button_six)
        val btnSeven: Button = findViewById(R.id.button_seven)
        val btnEight: Button = findViewById(R.id.button_eight)
        val btnNine: Button = findViewById(R.id.button_nine)
        val btnPoint: Button = findViewById(R.id.button_point)
        val btnAdd: Button = findViewById(R.id.button_add)
        val btnSubtract: Button = findViewById(R.id.button_subtract)
        val btnMultiply: Button = findViewById(R.id.button_multiply)
        val btnDivide: Button = findViewById(R.id.button_divide)
        val btnEquals: Button = findViewById(R.id.button_equals)

        btnZero.setOnClickListener {
            if (display.text.toString() != "0") {
                val str = "${display.text}${getText(R.string.zero)}"
                display.setText(str)
            }
        }
        btnOne.setOnClickListener {
            val str = "${display.text}${getText(R.string.one)}"
            display.setText(str)
        }
        btnTwo.setOnClickListener {
            val str = "${display.text}${getText(R.string.two)}"
            display.setText(str)
        }
        btnThree.setOnClickListener {
            val str = "${display.text}${getText(R.string.three)}"
            display.setText(str)
        }
        btnFour.setOnClickListener {
            val str = "${display.text}${getText(R.string.four)}"
            display.setText(str)
        }
        btnFive.setOnClickListener {
            val str = "${display.text}${getText(R.string.five)}"
            display.setText(str)
        }
        btnSix.setOnClickListener {
            val str = "${display.text}${getText(R.string.six)}"
            display.setText(str)
        }
        btnSeven.setOnClickListener {
            val str = "${display.text}${getText(R.string.seven)}"
            display.setText(str)
        }
        btnEight.setOnClickListener {
            val str = "${display.text}${getText(R.string.eight)}"
            display.setText(str)
        }
        btnNine.setOnClickListener {
            val str = "${display.text}${getText(R.string.nine)}"
            display.setText(str)
        }
        btnPoint.setOnClickListener {
            if (display.text.toString() == "") {
                val str = "0."
                display.setText(str)
            } else if (display.text.toString().indexOf('.') == -1) {
                val str = "${display.text}."
                display.setText(str)
            }
        }
        btnAdd.setOnClickListener {
            if (display.text.toString() != "") {
                if (tvSecondDigit.text.toString() != "") {
                    var result = tvSecondDigit.text.toString().toFloat()
                    when (tvOperator.text.toString()) {
                        getText(R.string.add) -> result += display.text.toString().toFloat()
                        getText(R.string.subtract) -> result -= display.text.toString().toFloat()
                        getText(R.string.multiply) -> result *= display.text.toString().toFloat()
                        getText(R.string.divide) -> result /= display.text.toString().toFloat()
                    }
                    tvSecondDigit.text = result.toString()
                } else {
                    tvSecondDigit.text = display.text.toString()
                }
                display.setText("")
            }
            tvOperator.text = getText(R.string.add)
        }
        btnSubtract.setOnClickListener {
            if (display.text.toString() != "") {
                if (tvSecondDigit.text.toString() != "") {
                    var result = tvSecondDigit.text.toString().toFloat()
                    when (tvOperator.text.toString()) {
                        getText(R.string.add) -> result += display.text.toString().toFloat()
                        getText(R.string.subtract) -> result -= display.text.toString().toFloat()
                        getText(R.string.multiply) -> result *= display.text.toString().toFloat()
                        getText(R.string.divide) -> result /= display.text.toString().toFloat()
                    }
                    tvSecondDigit.text = result.toString()
                } else {
                    tvSecondDigit.text = display.text.toString()
                }
                display.setText("")
            }
            tvOperator.text = getText(R.string.subtract)
        }
        btnMultiply.setOnClickListener {
            if (display.text.toString() != "") {
                if (tvSecondDigit.text.toString() != "") {
                    var result = tvSecondDigit.text.toString().toFloat()
                    when (tvOperator.text.toString()) {
                        getText(R.string.add) -> result += display.text.toString().toFloat()
                        getText(R.string.subtract) -> result -= display.text.toString().toFloat()
                        getText(R.string.multiply) -> result *= display.text.toString().toFloat()
                        getText(R.string.divide) -> result /= display.text.toString().toFloat()
                    }
                    tvSecondDigit.text = result.toString()
                } else {
                    tvSecondDigit.text = display.text.toString()
                }
                display.setText("")
            }
            tvOperator.text = getText(R.string.multiply)
        }
        btnDivide.setOnClickListener {
            if (display.text.toString() != "") {
                if (tvSecondDigit.text.toString() != "") {
                    var result = tvSecondDigit.text.toString().toFloat()
                    when (tvOperator.text.toString()) {
                        getText(R.string.add) -> result += display.text.toString().toFloat()
                        getText(R.string.subtract) -> result -= display.text.toString().toFloat()
                        getText(R.string.multiply) -> result *= display.text.toString().toFloat()
                        getText(R.string.divide) -> result /= display.text.toString().toFloat()
                    }
                    tvSecondDigit.text = result.toString()
                } else {
                    tvSecondDigit.text = display.text.toString()
                }
                display.setText("")
            }
            tvOperator.text = getText(R.string.divide)
        }
        btnEquals.setOnClickListener {
            if (display.text.toString() != "" && tvSecondDigit.text.toString() != "") {
                var result = tvSecondDigit.text.toString().toFloat()
                when (tvOperator.text.toString()) {
                    getText(R.string.add) -> result += display.text.toString().toFloat()
                    getText(R.string.subtract) -> result -= display.text.toString().toFloat()
                    getText(R.string.multiply) -> result *= display.text.toString().toFloat()
                    getText(R.string.divide) -> result /= display.text.toString().toFloat()
                }
                display.setText("$result")
                tvOperator.text = ""
                tvSecondDigit.text = ""
            }
        }
    }
}
