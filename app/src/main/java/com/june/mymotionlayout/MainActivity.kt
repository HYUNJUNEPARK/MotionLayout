package com.june.mymotionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.june.mymotionlayout.fragment.DragEventFragment
import com.june.mymotionlayout.fragment.TouchEventFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer1, TouchEventFragment.newInstance())
            .replace(R.id.fragmentContainer2, DragEventFragment.newInstance())
            .commit()
    }
}