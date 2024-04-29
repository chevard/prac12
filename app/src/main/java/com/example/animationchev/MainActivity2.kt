package com.example.animationchev

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val roof:ImageView = findViewById(R.id.roof)
        val base:ImageView = findViewById(R.id.base)
        val window:ImageView = findViewById(R.id.window)
        val roofUpAnimation = AnimationUtils.loadAnimation(this, R.anim.roof_up)
        val baseDownAnimation = AnimationUtils.loadAnimation(this, R.anim.base_down)
        val windowRightAnimation = AnimationUtils.loadAnimation(this, R.anim.window_right)
        roof.startAnimation(roofUpAnimation)
        base.startAnimation(baseDownAnimation)
        window.startAnimation(windowRightAnimation)
    }

}