package com.user.slmexlawyer.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.user.slmexlawyer.databinding.ActivityForgotPasswordBinding;

public class ForgotPassword extends AppCompatActivity {
ActivityForgotPasswordBinding forgotbind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        forgotbind = ActivityForgotPasswordBinding.inflate(getLayoutInflater());

        setContentView(forgotbind.getRoot());

    }
}