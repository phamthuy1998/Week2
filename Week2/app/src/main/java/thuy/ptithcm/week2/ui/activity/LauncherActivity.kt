package thuy.ptithcm.week2.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thuy.ptithcm.week2.R

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
