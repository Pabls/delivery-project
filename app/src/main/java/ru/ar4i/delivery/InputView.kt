package ru.ar4i.delivery

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class InputView(context: Context, attributeSet: AttributeSet? = null) :
    FrameLayout(context, attributeSet) {

    private var tvHint: TextView? = null
    private var tvError: TextView? = null
    private var etValue: TextInputEditText

    init {
        inflate(context, R.layout.input_view, this)
        tvHint = findViewById(R.id.tvHint)
        tvError = findViewById(R.id.tvError)
        etValue = findViewById(R.id.etValue)
    }
}