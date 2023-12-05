package com.user.slmexlawyer.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.user.slmexlawyer.R;
import com.user.slmexlawyer.databinding.ActivityCompleteProfileInfoBinding;
import com.user.slmexlawyer.fragment.HomepageFragment;

public class CompleteProfileInfo extends AppCompatActivity {
ActivityCompleteProfileInfoBinding binding;
Dialog dialog;
TextView btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCompleteProfileInfoBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        init_UI();
    }

    private void init_UI() {

        PopupMethod();

        binding.skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(CompleteProfileInfo.this,HomepageActivity.class);
                startActivity(in);
            }
        });


    }

    private void PopupMethod() {

        dialog = new Dialog(this);
        Window window = dialog.getWindow();
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.popup_profile_complete);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.round_doctor_time);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT);
        btn = dialog.findViewById(R.id.popupProfileBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(CompleteProfileInfo.this, HomepageActivity.class);
                startActivity(main);
            }
        });

        binding.pfSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });
    }
}