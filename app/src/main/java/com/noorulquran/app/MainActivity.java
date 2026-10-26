package com.noorulquran.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Main screen layout load karega
        setContentView(R.layout.activity_main);

        // App title
        setTitle("Noorul Quran");
    }
}
