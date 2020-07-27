package com.captchabro.captchabro;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.captchabro.captchabro.databinding.ActivityEditProfileBinding;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

public class EditProfile extends AppCompatActivity {

    ActivityEditProfileBinding binding;
    MaterialButton save;
    MaterialToolbar topAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditProfileBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        save = binding.save;
        topAppBar = binding.topAppBar;
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                        startActivity(new Intent(getApplicationContext(),Profile.class));
                        break;
                }
                return false;
            }
        });
    }
}
