package com.user.slmexlawyer.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.user.slmexlawyer.Activities.HomepageActivity;
import com.user.slmexlawyer.Activities.Notification;
import com.user.slmexlawyer.R;
import com.user.slmexlawyer.databinding.FragmentHomepageBinding;


public class HomepageFragment extends Fragment {
FragmentHomepageBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

    binding = FragmentHomepageBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        init_UI();
        return view;
    }

    private void init_UI() {
binding.notifyBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
       Intent in = new Intent(getContext(),Notification.class);
       startActivity(in);
    }
});


    }
}