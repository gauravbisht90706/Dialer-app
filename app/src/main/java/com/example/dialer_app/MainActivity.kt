package com.example.dialer_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name:EditText = findViewById(R.id.NameText)
        var email_id:EditText = findViewById(R.id.EmailText)
        var contact_number:EditText = findViewById(R.id.ContactText)
        var call:Button = findViewById(R.id.CallButton)

        call.setOnClickListener(){
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+contact_number.text.toString())
            startActivity(intent)
        }

    }
}


