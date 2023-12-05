package com.user.slmexlawyer.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.user.slmexlawyer.adapter.NotificationAdapter;
import com.user.slmexlawyer.databinding.ActivityNotificationBinding;

import java.util.ArrayList;

public class Notification extends AppCompatActivity {
ActivityNotificationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init_UI();
    }

    private void init_UI() {

        recyclerNotify();
    }

    private void recyclerNotify() {

        ArrayList<String> notifyholder = new ArrayList<>();
        notifyholder.add("1");
        notifyholder.add("1");
        notifyholder.add("1");
        notifyholder.add("1");

        binding.notifyRv.setAdapter(new NotificationAdapter((ArrayList<String>) notifyholder));


    }
}