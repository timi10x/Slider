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

        seekBar.max = TIME_MILLS
        seekBar?.addOnPreviewTextChangeListener(object : CustomSeekBar.OnPreviewTextChangeListener {
            override fun onPreviewTextChanged(seekBar: CustomSeekBar, progress: Int): String {
                val rn: Int = Random.nextInt(900000) + 100000
                val duration = seekBar.progress.toLong()

                val hours = java.util.concurrent.TimeUnit.MILLISECONDS.toHours(duration)
                val minutes =
                    java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(duration) - java.util.concurrent.TimeUnit.HOURS.toMinutes(
                        java.util.concurrent.TimeUnit.MILLISECONDS.toHours(duration)
                    )
                val seconds =
                    java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(duration) - java.util.concurrent.TimeUnit.MINUTES.toSeconds(
                        java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(duration)
                    )

                return String.format(rn.toString())
            }
        })
    }

    companion object {
        private const val TIME_MILLS = 5025000
    }
}

