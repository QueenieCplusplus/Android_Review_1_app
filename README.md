# Android_Review_1_app
我的媽祖關公孫悟空卡通版本的抽籤應用程式（看看今日運勢如何，祝你好手氣！）

  ![](https://github.com/QueenieCplusplus/Android_Review_1_app/raw/main/output1.png)

![](https://github.com/QueenieCplusplus/Android_Review_1_app/raw/main/output2.png)

  ![](https://github.com/QueenieCplusplus/Android_Review_1_app/raw/main/output3.png)

![](https://github.com/QueenieCplusplus/Android_Review_1_app/raw/main/output4.png)

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
