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

public class HomeActivity extends AppCompatActivity {

    private TextView loginButton, registerButton, totalSavingsLabel, addNote;
    private ImageView eyeIcon, homeButton, addButton, avatar, logoImage;
    private EditText dreamInput;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Pastikan nama layout Anda adalah `activity_main.xml`

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

        loginButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               Toast.makeText(HomeActivity.this, "Login Button Clicked", Toast.LENGTH_SHORT).show();
                                           }
                                       }
        );
        registerButton.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  Toast.makeText(HomeActivity.this, "Register Button Clicked", Toast.LENGTH_SHORT).show();
                                              }
                                          }
        );
        eyeIcon.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(HomeActivity.this, "Eye Icon Clicked", Toast.LENGTH_SHORT).show();
                                       }
                                   }
        );
        addNote.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(HomeActivity.this, "Tambah Catatan Baru", Toast.LENGTH_SHORT).show();
                                       }
                                   }
        );
        homeButton.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Toast.makeText(HomeActivity.this, "Home Button Clicked", Toast.LENGTH_SHORT).show();
                                          }
                                      }
        );
        addButton.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             Toast.makeText(HomeActivity.this, "Add Button Clicked", Toast.LENGTH_SHORT).show();
                                         }
                                     }
        );
        avatar.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Toast.makeText(HomeActivity.this, "Avatar Clicked", Toast.LENGTH_SHORT).show();
                                      }
                                  }
        );

    }
}
