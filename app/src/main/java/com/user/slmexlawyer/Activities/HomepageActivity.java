package com.user.slmexlawyer.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.user.slmexlawyer.R;
import com.user.slmexlawyer.databinding.ActivityHomepageBinding;
import com.user.slmexlawyer.fragment.HomepageFragment;

public class HomepageActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
ActivityHomepageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomepageBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        init_UI();
    }

    private void init_UI() {

        binding.navBar.setOnNavigationItemSelectedListener(this);
        binding.navBar.setSelectedItemId(R.id.home);




    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.home:
                HomepageFragment homepageFragment = new HomepageFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fm_layout,homepageFragment).addToBackStack("homeFragment").commit();



        }
        return false;
    }
}