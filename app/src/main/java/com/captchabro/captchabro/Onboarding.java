package com.captchabro.captchabro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;


import com.captchabro.captchabro.databinding.ActivityOnboardingBinding;
import com.google.android.material.button.MaterialButton;

public class Onboarding extends AppCompatActivity {

    ActivityOnboardingBinding binding;

    MaterialButton signIn;
    MaterialButton signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOnboardingBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        signIn = binding.signIn;
        signUp = binding.signUp;

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LogIn.class));
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MobileVerify.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (!sharedPreferences.getBoolean("isOnboardingCompleted", false)) {
            startActivity(new Intent(this, Splash.class));
        }
    }
}
