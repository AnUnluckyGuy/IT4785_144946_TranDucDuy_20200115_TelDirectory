package com.example.telephonedirectory

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InformationActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information);

        val id = intent.getStringExtra("id");
        val name = intent.getStringExtra("name");
        val phoneNumber = intent.getStringExtra("phoneNumber");
        val email = intent.getStringExtra("email");

        findViewById<TextView>(R.id.info_id).text = id;
        findViewById<TextView>(R.id.info_name).text = name;
        findViewById<TextView>(R.id.info_phoneNumber).text = phoneNumber;
        findViewById<TextView>(R.id.info_email).text = email;
    }
}