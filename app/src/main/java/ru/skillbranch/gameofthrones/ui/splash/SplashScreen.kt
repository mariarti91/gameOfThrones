package ru.skillbranch.gameofthrones.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ru.skillbranch.gameofthrones.ui.main.MainActivity

class SplashScreen: AppCompatActivity() {

    private val loadTime = 5000L //5 sec
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        handler = Handler()
        handler.postDelayed({
            loadMainActivity()
        }, loadTime)
    }

    private fun loadMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}