package com.captchabro.captchabro;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import com.captchabro.captchabro.databinding.ActivityNotificationsBinding;
import com.google.android.material.appbar.MaterialToolbar;

public class Notifications extends AppCompatActivity {

    ActivityNotificationsBinding binding;

    MaterialToolbar topAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        topAppBar = binding.topAppBar;

        topAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    /*case R.id.notifications:
                        startActivity(new Intent(getApplicationContext(),Notifications.class));
                        break;*/
                    case R.id.wallet:
                        startActivity(new Intent(getApplicationContext(),Wallet.class));
                        break;
                    case R.id.navigationMenu:
                        startActivity(new Intent(getApplicationContext(),Profile.class));
                        break;
                }
                return false;
            }
        });
    }
}
