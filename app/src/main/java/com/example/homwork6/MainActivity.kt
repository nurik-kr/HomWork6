package com.example.homwork6

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var tvTitle: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTitle = findViewById(R.id.tvTitle)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    @SuppressLint("SetTextI18n")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, product::class.java)
        val intent1 = Intent(this, services::class.java)
        when (item.itemId) {
            R.id.product -> startActivity(intent)
            R.id.uslugi -> startActivity(intent1)
            R.id.proga -> tvTitle?.text="О приложении что могу сказать\nсамое простое приложение пока что фантазий чутка мало\nно думаю вскором времени и научимся красиво верстать"
        }

        return super.onOptionsItemSelected(item)
    }
}
