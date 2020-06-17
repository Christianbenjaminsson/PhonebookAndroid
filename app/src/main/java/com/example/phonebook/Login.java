package com.example.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    LinearLayout linearLayout1;
    TextView textViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        linearLayout1 = new LinearLayout(getBaseContext());
        linearLayout1.setOrientation(LinearLayout.VERTICAL);
        textViewWelcome.setText("Welcome");
        textViewWelcome.setTextColor(Color.argb(100, 0, 0, 0));
    }
}