package com.example.database_sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var userDBHelper: DBHelper
    lateinit var tampil: TextView
    lateinit var lltampil: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        userDBHelper = DBHelper(this)
        tampil = findViewById(R.id.tampil_semua)
        lltampil = findViewById(R.id.ll_tampil)
        var tampilkan = userDBHelper.fullData()
        lltampil.removeAllViews()
        tampilkan.forEach {
            tampil.text = it.email.toString() + " - "  + it.pass.toString() + " - "  +
                    it.username.toString() + " - "  + it.fullname.toString()
            lltampil.addView(tampil)
        }

    }
}