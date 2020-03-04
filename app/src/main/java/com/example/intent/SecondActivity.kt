package com.example.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.calcapp.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


            val a = intent.getIntExtra("a",0)

            val value1 = intent.getDoubleExtra("VALUE1", 0.0)
            val value2 = intent.getDoubleExtra("VALUE2", 0.0)
            val value3 = intent.getDoubleExtra("VALUE3", 0.0)
            val value4 = intent.getDoubleExtra("VALUE4", 0.0)
            val value5 = intent.getDoubleExtra("VALUE5", 0.0)
            val value6 = intent.getDoubleExtra("VALUE6", 0.0)
            val value7 = intent.getDoubleExtra("VALUE7", 0.0)
            val value8 = intent.getDoubleExtra("VALUE8", 0.0)

        when(a) {
            1 ->{ textView.text = "${value1 + value2}"
            }

            2 -> {textView.text = "${value3 - value4}"
            }

            3 -> {textView.text = "${value5 * value6}"
            }

            4 -> {textView.text = "${value7 / value8}"
            }
        }
    }
}
