package com.captchabro.captchabro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.captchabro.captchabro.databinding.ActivityMobileVerifyBinding;
import com.google.android.material.button.MaterialButton;

public class MobileVerify extends AppCompatActivity {

    ActivityMobileVerifyBinding binding;

    MaterialButton verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMobileVerifyBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        verify = binding.verify;
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignUp.class));
            }
        });
    }
}
