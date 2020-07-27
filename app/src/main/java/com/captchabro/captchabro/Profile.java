package com.captchabro.captchabro;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import com.captchabro.captchabro.databinding.ActivityProfileBinding;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

public class Profile extends AppCompatActivity {

    ActivityProfileBinding binding;

    MaterialToolbar topAppBar;
    MaterialButton editProfile;

    LinearLayout packages;
    LinearLayout myOrders;
    LinearLayout support;
    LinearLayout logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        topAppBar = binding.topAppBar;
        editProfile = binding.editProfile;
        packages = binding.packages;
        myOrders = binding.orders;
        support = binding.support;
        logOut = binding.logOut;

        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), EditProfile.class));
            }
        });

        packages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Packages.class));
            }
        });

        myOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),OrderHistory.class));
            }
        });

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Support.class));
            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Onboarding.class));
                finish();
            }
        });

        topAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.notifications:
                        startActivity(new Intent(getApplicationContext(), Notifications.class));
                        break;
                    case R.id.wallet:
                        startActivity(new Intent(getApplicationContext(),Wallet.class));
                        break;
                    case R.id.navigationMenu:
                        startActivity(new Intent(getApplicationContext(), Dashboard.class));
                        break;
                }
                return false;
            }
        });
    }
}
