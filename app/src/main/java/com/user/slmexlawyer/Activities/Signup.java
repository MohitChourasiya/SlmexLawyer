package com.user.slmexlawyer.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.user.slmexlawyer.databinding.ActivitySignupBinding;

public class Signup extends AppCompatActivity {
ActivitySignupBinding signupBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        signupBinding = ActivitySignupBinding.inflate(getLayoutInflater());
        
        setContentView(signupBinding.getRoot());
        init_UI();
    }

    private void init_UI() {
        signupBinding.submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(Signup.this,VerificationActivity.class);
                startActivity(mainIntent);
                finish();

            }
        });

        signupBinding.lTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainIntent = new Intent(Signup.this,Login.class);
                startActivity(mainIntent);


            }
        });

    }
}