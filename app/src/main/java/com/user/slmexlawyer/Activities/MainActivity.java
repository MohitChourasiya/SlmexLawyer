package com.user.slmexlawyer.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.user.slmexlawyer.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new Handler(Looper.getMainLooper()).

                postDelayed(new Runnable() {
                    @Override
                    public void run () {




                            Intent mainIntent = new Intent(MainActivity.this, Login.class);
                            startActivity(mainIntent);
                            finish();

                    }
                },3000);

    }
}