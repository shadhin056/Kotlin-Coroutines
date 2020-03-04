package com.shadhin.kotlincoroutines

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IndexActivity : AppCompatActivity() {
    private lateinit var btnImageView: Button
    private lateinit var btnRetrofitMVVMCoroutine: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
        init();
        buttonAction();
    }

    private fun init() {
        btnImageView = findViewById(R.id.btnImageView) as Button
        btnRetrofitMVVMCoroutine = findViewById(R.id.btnRetrofitMVVMCoroutine) as Button
    }

    private fun buttonAction() {
        btnImageView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
        };
        btnRetrofitMVVMCoroutine.setOnClickListener {
            val intent = Intent(this, MVVMRetrofitCoroutineActivity::class.java)
            startActivity(intent);
        };
    }
}
