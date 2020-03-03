package com.example.echo
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)

        findViewById(R.id.btnLinkToLogIn).setOnClickListener {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }

    }
}
