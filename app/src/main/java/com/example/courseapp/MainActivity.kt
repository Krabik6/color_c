package com.example.courseapp

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

//игра типа сделай такой-же цвет, тебе дается пример цвета, а ты должен его повторить с помощью argb
    //мб потом добавить фичу тип 4 цифры для примера цвета генерируются рандомно
    var counter = 0
    var alpha = 255
    var red = 0
    var green = 0
    var blue = 0

    var step = 1

    var coloric = Color.argb(alpha, red, green, blue)
    enum class Colors{
        alpha,
        red,
        green,
        blue
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val counterView = findViewById<TextView>(R.id.counter)
        counterView.text = counter.toString()
        counterView.setBackgroundColor(coloric)
        Log.d("MyLog", coloric.toString())
    }

    fun redPlus(view : View){
        val counterView = findViewById<TextView>(R.id.counter)
        counter += 1
        counterView.text = counter.toString()

        changeRed(true)
        counterView.setBackgroundColor(coloric)
        Log.d("MyLog", red.toString())
    }

//    fun changeState(isPlus: Boolean, color: Color){
// типа типа
//        counter++
//
//        if (color == Color.alpha) {
//
//        }
//
//        val counterView = findViewById<TextView>(R.id.counter)
//        counter += 1
//        counterView.text = counter.toString()
//
//        changeRed(true)
//        counterView.setBackgroundColor(coloric)
//        Log.d("MyLog", red.toString())
//    }

    fun redMinus(view : View){
        val counterView = findViewById<TextView>(R.id.counter)
        counter -= 1
        changeRed(false)
        counterView.text = counter.toString()
        counterView.setBackgroundColor(coloric)
        Log.d("MyLog", red.toString())

    }

    fun alphaPlus(view : View){
        val counterView = findViewById<TextView>(R.id.counter)
        counter += 1
        counterView.text = counter.toString()

        changeAlpha(true)
        counterView.setBackgroundColor(coloric)
        Log.d("MyLog", alpha.toString())
    }

    fun alphaMinus(view : View){
        val counterView = findViewById<TextView>(R.id.counter)
        counter -= 1
        counterView.text = counter.toString()

        changeAlpha(false)
        counterView.setBackgroundColor(coloric)
        Log.d("MyLog", alpha.toString())
    }

    fun greenPlus(view : View){
        val counterView = findViewById<TextView>(R.id.counter)
        counter += 1
        counterView.text = counter.toString()

        changeGreen(true)
        counterView.setBackgroundColor(coloric)
        Log.d("MyLog", green.toString())
    }

    fun greenMinus(view : View){
        val counterView = findViewById<TextView>(R.id.counter)
        counter -= 1
        counterView.text = counter.toString()

        changeGreen(false)
        counterView.setBackgroundColor(coloric)
        Log.d("MyLog", green.toString())
    }

    fun bluePlus(view : View){
        val counterView = findViewById<TextView>(R.id.counter)
        counter += 1
        counterView.text = counter.toString()

        changeBlue(true)
        counterView.setBackgroundColor(coloric)
        Log.d("MyLog", blue.toString())
    }

    fun blueMinus(view : View){
        val counterView = findViewById<TextView>(R.id.counter)
        counter -= 1
        counterView.text = counter.toString()

        changeBlue(false)
        counterView.setBackgroundColor(coloric)
        Log.d("MyLog", blue.toString())
    }

    fun changeRed(plus : Boolean){
        if (plus == true){
            if (red+step <= 255){
                red += step
            }
        } else {
            if (red-step >= 0){
                red -= step
            }
        }
        coloric = Color.argb(alpha, red, green, blue)
    }

    fun changeGreen(plus : Boolean){
        if (plus == true){
            if (green+step <= 255){
                green += step
            }
        } else {
            if (green-step >= 0){
                green -= step
            }
        }
        coloric = Color.argb(alpha, red, green, blue)
    }

    fun changeBlue(plus : Boolean){
        if (plus){
            if (blue+step <= 255){
                blue += step
            }
        } else {
            if (blue-step >= 0){
                blue -= step
            }
        }
        coloric = Color.argb(alpha, red, green, blue)
    }

    fun changeAlpha(plus : Boolean){
        if (plus){
            if (alpha+step <= 255){
                alpha += step
            }
        } else {
            if (alpha-step >= 0){
                alpha -= step
            }
        }
        coloric = Color.argb(alpha, red, green, blue)
    }

    fun changeStep(view : View){
        val sw1 = findViewById<Switch>(R.id.switch3)
        sw1?.setOnCheckedChangeListener({ _ , isChecked ->
            Log.d("MyLog", isChecked.toString())
            if (isChecked) {
                step = 10
            } else {
                step = 1
            }
        })
        Log.d("MyLog", step.toString())
    }

    override fun onRestart() {
        super.onRestart()
    }

}


