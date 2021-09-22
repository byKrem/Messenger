package com.example.messenger;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Intent intent = this.getIntent();

        if (intent != null){
            String name = intent.getStringExtra("name");
            String phoneNo = intent.getStringExtra("phoneNo");
            String country = intent.getStringExtra("country");
            int imageId = intent.getIntExtra("imageId",R.drawable.a);


        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
