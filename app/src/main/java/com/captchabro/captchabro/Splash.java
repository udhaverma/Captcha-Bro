package com.captchabro.captchabro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import com.github.appintro.AppIntro2;
import com.github.appintro.AppIntroFragment;

public class Splash extends AppIntro2  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance(
                "The title of your slide",
                "A description that will be shown on the bottom"
                ));

        addSlide(AppIntroFragment.newInstance(
                "The title of your slide",
                "A description that will be shown on the bottom"
        ));

        addSlide(AppIntroFragment.newInstance(
                "The title of your slide",
                "A description that will be shown on the bottom"
        ));
    }

    @Override
    protected void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        SharedPreferences.Editor sharedPreferencesEditor =
                PreferenceManager.getDefaultSharedPreferences(Splash.this).edit();
        sharedPreferencesEditor.putBoolean(
                "isOnboardingCompleted", true);
        sharedPreferencesEditor.apply();

        startActivity(new Intent(Splash.this, Onboarding.class));
    }

    @Override
    protected void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        SharedPreferences.Editor sharedPreferencesEditor =
                PreferenceManager.getDefaultSharedPreferences(Splash.this).edit();
        sharedPreferencesEditor.putBoolean(
                "isOnboardingCompleted", true);
        sharedPreferencesEditor.apply();

        startActivity(new Intent(Splash.this, Onboarding.class));
    }
}
