package ru.ar4i.delivery

import android.content.Context
import android.text.Editable
import android.util.AttributeSet
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged

class CodeInputView(context: Context, attributeSet: AttributeSet? = null) :
    LinearLayout(context, attributeSet) {

    private var tvFirst: TextView
    private var tvSecond: TextView
    private var tvThird: TextView
    private var tvFourth: TextView
    private var etInput: EditText


    init {
        orientation = HORIZONTAL
        FrameLayout.inflate(context, R.layout.view_code_input, this)
        tvFirst = findViewById(R.id.tvFirst)
        tvSecond = findViewById(R.id.tvSecond)
        tvThird = findViewById(R.id.tvThird)
        tvFourth = findViewById(R.id.tvFourth)
        etInput = findViewById(R.id.etInput)

        etInput.requestFocus()
        etInput.doAfterTextChanged { text -> shoeCode(text) }
    }

    private fun shoeCode(text: Editable? = null) {
        when {
            text.isNullOrEmpty() -> setCode()
            text.length == 1 -> setCode(text.toString())
            text.length == 2 -> setCode(text[0].toString(), text[1].toString())
            text.length == 3 -> setCode(text[0].toString(), text[1].toString(), text[2].toString())
            text.length == 4 -> setCode(
                text[0].toString(),
                text[1].toString(),
                text[2].toString(),
                text[3].toString()
            )
        }
    }


    private fun setCode(
        firstChar: String? = null,
        secondChar: String? = null,
        thirdChar: String? = null,
        fourthChar: String? = null
    ) {
        tvFirst.text = firstChar
        tvSecond.text = secondChar
        tvThird.text = thirdChar
        tvFourth.text = fourthChar
    }
}