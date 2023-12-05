package com.user.slmexlawyer.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.user.slmexlawyer.databinding.ActivityMoreInfopageBinding;

public class MoreInfopage extends AppCompatActivity {
ActivityMoreInfopageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMoreInfopageBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        init_UI();
    }

    private void init_UI() {


    }
}