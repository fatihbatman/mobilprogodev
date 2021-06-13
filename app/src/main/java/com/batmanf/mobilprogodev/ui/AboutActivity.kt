package com.batmanf.mobilprogodev.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.batmanf.mobilprogodev.R
import kotlinx.android.synthetic.main.layout_toolbar.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        setSupportActionBar(ac_toolbar)

        supportActionBar?.apply {
            title = "Hakkında"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}