package com.example.calcapp

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import com.example.intent.SecondActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View){
        when(v.id) {
            R.id.button1 -> tasizan()
            R.id.button2 -> hikizan()
            R.id.button3 -> kakezan()
            R.id.button4 -> warizan()
        }
    }

    private fun tasizan() {

            if (editText1.text.toString().equals("") || editText2.text.toString().equals("")){

                Snackbar.make(editText1, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()

            } else{

            var num1 = editText1.text.toString().toDouble()
            var num2 = editText2.text.toString().toDouble()

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", num1)
        intent.putExtra("VALUE2", num2)

        intent.putExtra("a", 1)

        startActivity(intent)
        }
    }
    private fun hikizan () {

        if (editText1.text.toString().equals("") || editText2.text.toString().equals("")) {

            Snackbar.make(editText1, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

        } else {

            var num1 = editText1.text.toString().toDouble()
            var num2 = editText2.text.toString().toDouble()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE3", num1)
            intent.putExtra("VALUE4", num2)

            intent.putExtra("a", 2)

            startActivity(intent)
        }
    }

    private fun kakezan () {

        if (editText1.text.toString().equals("") || editText2.text.toString().equals("")) {

            Snackbar.make(editText1, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

        } else {

            var num1 = editText1.text.toString().toDouble()
            var num2 = editText2.text.toString().toDouble()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE5", num1)
            intent.putExtra("VALUE6", num2)

            intent.putExtra("a", 3)

            startActivity(intent)
        }
    }
    private fun warizan () {
        if (editText1.text.toString().equals("") || editText2.text.toString().equals("")) {

            Snackbar.make(editText1, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

        } else {

            var num1 = editText1.text.toString().toDouble()
            var num2 = editText2.text.toString().toDouble()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE7", num1)
            intent.putExtra("VALUE8", num2)

            intent.putExtra("a", 4)

            startActivity(intent)
        }
    }
}
