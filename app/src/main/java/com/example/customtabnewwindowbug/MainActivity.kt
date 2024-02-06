package com.example.customtabnewwindowbug

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import com.example.customtabnewwindowbug.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    setSupportActionBar(binding.toolbar)

    binding.customTabButton.setOnClickListener {
      val url = "https://www.google.com"
      val customTabsIntent = CustomTabsIntent.Builder().build()
      customTabsIntent.launchUrl(this, Uri.parse(url))
    }

  }

}
