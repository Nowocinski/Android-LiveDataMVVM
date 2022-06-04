package com.example.livedatamvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer1, fragment1)
                .replace(R.id.fragmentContainer2, fragment2)
                .commit();
    }
}