package com.stormkid.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {
  private  val map = mutableMapOf(Pair(0,1),Pair(1,2),Pair(2,3),Pair(3,4),Pair(4,5))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 不兼容的代码 可以用6.0以下的机型进行测试，并可以在7上进行使用
        map.forEach { t, u ->
            Log.i("xxx","$u")
        }
    }
}
