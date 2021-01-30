package com.katepatty.luckyroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roller()

    }

    private fun roller(){

        // 宣告容器變數
        val outputStr: TextView = findViewById(R.id.rollResultTxt)
        val outputImg: ImageView = findViewById(R.id.rollResultImg)

        // 生出隨機值
        val randomInt = (1..5).random()

        // 將隨機值指派給容器變數的屬性中
        //outputStr.text = randomInt.toString()
        //rollResultTxt. got its method too

        val randomTxt = when (randomInt){

            1 -> "好運連連"
            2 -> "貴人加持"
            3 -> "喜憂參半"
            else -> "請回府，記得拜拜喔！下次再來玩～"

        }

        val randomSrc = when (randomInt) {

            1 -> R.drawable.notbad
            2 -> R.drawable.luck
            3 -> R.drawable.gotpower
            else -> R.drawable.home

        }
        // below resId = 容器變數放回呼值
        outputImg.setImageResource(randomSrc)
        outputStr.setText(randomTxt)

    }
}