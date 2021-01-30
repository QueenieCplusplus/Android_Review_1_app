# Android_Review_1_app
我的媽祖關公孫悟空卡通版本的抽籤應用程式（看看今日運勢如何，祝你好手氣！）

  ![](https://github.com/QueenieCplusplus/Android_Review_1_app/raw/main/output1.png)

![](https://github.com/QueenieCplusplus/Android_Review_1_app/raw/main/output2.png)

  ![](https://github.com/QueenieCplusplus/Android_Review_1_app/raw/main/output3.png)

![](https://github.com/QueenieCplusplus/Android_Review_1_app/raw/main/outputX.png)

* 畫面佈局

        <?xml version="1.0" encoding="utf-8"?>
        <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            tools:context=".MainActivity">

            <TextView
                android:id="@+id/rollResultTxt"
                android:gravity="center_horizontal"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_constraintLeft_toLeftOf="parent"
                app:layout_constraintRight_toRightOf="parent"
                android:textSize="30dp"
                app:layout_constraintBottom_toTopOf="@+id/rollResultImg"
                />


            <ImageView
                android:id="@+id/rollResultImg"
                android:layout_marginTop="100dip"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintLeft_toLeftOf="parent"
                app:layout_constraintRight_toRightOf="parent"
                app:layout_constraintTop_toTopOf="parent" />

        </androidx.constraintlayout.widget.ConstraintLayout>

* 邏輯撰寫

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
