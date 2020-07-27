package com.captchabro.captchabro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


import com.captchabro.captchabro.databinding.ActivitySelectPlanBinding;
import com.google.android.material.button.MaterialButton;

public class SelectPlan extends AppCompatActivity {


    ActivitySelectPlanBinding binding;

    MaterialButton getStarted1;
    MaterialButton getStarted2;
    MaterialButton getStarted3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySelectPlanBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getStarted1 = binding.getStarted1;
        getStarted2 = binding.getStarted2;
        getStarted3 = binding.getStarted3;

        getStarted1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Dashboard.class));

            }
        });
        getStarted2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Dashboard.class));

            }
        });
        getStarted3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Dashboard.class));

            }
        });

    }
}
