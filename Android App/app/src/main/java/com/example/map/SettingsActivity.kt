package com.example.map

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsActivity : AppCompatActivity() {
    private lateinit var homeButton:Button

    private lateinit var background:ConstraintLayout
    private lateinit var settingsTxt:TextView
    private lateinit var darkMode:Switch
    private lateinit var About:TextView
    private lateinit var AboutText:TextView
    var isDark:Boolean = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        homeButton = findViewById(R.id.homeButton1)
        homeButton.text = "Home"
        darkMode = findViewById(R.id.switch1)
        background = findViewById(R.id.main)
        settingsTxt = findViewById(R.id.SettingsText)
        About = findViewById(R.id.About1)
        AboutText = findViewById(R.id.about2)




        homeButton.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("DarkMode", isDark)
            startActivity(intent)

        }

        val intent = intent
        isDark = intent.getBooleanExtra("Dark", false)

        if (isDark) {
            darkMode.isChecked = true
            background.setBackgroundColor(Color.DKGRAY)
            settingsTxt.setTextColor(Color.WHITE)
            darkMode.setTextColor(Color.WHITE)
            About.setTextColor(Color.WHITE)
            AboutText.setTextColor(Color.WHITE)
        }
        else {
            darkMode.isChecked = false
            background.setBackgroundColor(Color.WHITE)
            settingsTxt.setTextColor(Color.BLACK)
            darkMode.setTextColor(Color.BLACK)
            About.setTextColor(Color.BLACK)
            AboutText.setTextColor(Color.BLACK)
        }

        darkMode.setOnCheckedChangeListener { darkMode, isChecked ->
            if (isChecked) {
                isDark = true;
                background.setBackgroundColor(Color.DKGRAY)
                settingsTxt.setTextColor(Color.WHITE)
                darkMode.setTextColor(Color.WHITE)
                About.setTextColor(Color.WHITE)
                AboutText.setTextColor(Color.WHITE)
            } else {
                isDark = false;
                background.setBackgroundColor(Color.WHITE)
                settingsTxt.setTextColor(Color.BLACK)
                darkMode.setTextColor(Color.BLACK)
                About.setTextColor(Color.BLACK)
                AboutText.setTextColor(Color.BLACK)
            }
        }
    }
}