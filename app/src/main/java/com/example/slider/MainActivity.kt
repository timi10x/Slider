package com.example.slider

import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.SeekBar.OnSeekBarChangeListener
import android.util.DisplayMetrics

import android.content.res.Resources

import android.graphics.Point

import android.view.WindowManager

import android.view.Display

import android.content.Context
import android.icu.util.TimeUnit

import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val seekBar = findViewById<CustomSeekBar>(R.id.seekBar)

        seekBar?.addOnPreviewTextChangeListener(object : CustomSeekBar.OnPreviewTextChangeListener {
            override fun onPreviewTextChanged(seekBar: CustomSeekBar, progress: Int): String {
                val rn: Int = Random.nextInt(900000) + 100000
                return String.format(rn.toString())
            }
        })
    }
}

