package com.user.slmexlawyer.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.user.slmexlawyer.databinding.ActivityVerificationBinding;

public class VerificationActivity extends AppCompatActivity {
ActivityVerificationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityVerificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init_UI();





    }

    private void init_UI() {

        binding.submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainIntent = new Intent(VerificationActivity.this,Login.class);
                startActivity(mainIntent);
               }});


    }
}