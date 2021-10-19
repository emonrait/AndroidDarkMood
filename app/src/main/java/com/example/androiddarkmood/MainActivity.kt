package com.example.androiddarkmood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    private lateinit var switchtheme: Switch
    override fun onCreate(savedInstanceState: Bundle?) {




        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.ThemeOverlay_MaterialComponents_Light)
        } else {
            setTheme(R.style.ThemeOverlay_MaterialComponents_Dark)
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchtheme = findViewById(R.id.switchtheme)

        switchtheme.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }

        }
    }
}