package ru.ar4i.delivery

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class InputView(context: Context, attributeSet: AttributeSet? = null) :
    FrameLayout(context, attributeSet) {

    private var tvHint: TextView
    private var tvError: TextView
    private var etValue: TextInputEditText

    init {
        inflate(context, R.layout.view_input, this)
        tvHint = findViewById(R.id.tvHint)
        tvError = findViewById(R.id.tvError)
        etValue = findViewById(R.id.etValue)

        var array: TypedArray? = null
        try {
            array = context.obtainStyledAttributes(attributeSet, R.styleable.InputView, 0, 0)
            array.apply {
                etValue.hint = getString(R.styleable.InputView_iv_et_hint)
                tvHint.text = getString(R.styleable.InputView_iv_tv_hint)
                tvError.text = getString(R.styleable.InputView_iv_error)
            }
        } finally {
            array?.recycle()
        }

    }
}