package com.example.money;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.money.R;

public class MainActivity extends AppCompatActivity {

    private TextView loginButton, registerButton, totalSavingsLabel, addNote;
    private ImageView eyeIcon, homeButton, addButton, avatar, logoImage;
    private EditText dreamInput;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Pastikan nama layout Anda adalah `activity_main.xml`

        // Inisialisasi View
        loginButton = findViewById(R.id.loginButton);
        registerButton = findViewById(R.id.registerButton);
        totalSavingsLabel = findViewById(R.id.totalSavingsLabel);
        eyeIcon = findViewById(R.id.eyeIcon);
        homeButton = findViewById(R.id.homeButton);
        addButton = findViewById(R.id.addButton);
        avatar = findViewById(R.id.avatar);
        logoImage = findViewById(R.id.logoImage);
        dreamInput = findViewById(R.id.dreamInput);
        addNote = findViewById(R.id.addNote);

    }
}
