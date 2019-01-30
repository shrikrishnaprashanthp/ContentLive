package com.primefocus.mobile.contentlive.activity;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.primefocus.mobile.contentlive.R;
import com.primefocus.mobile.contentlive.fragments.LoginFragment;

public class LandingActivity extends AppCompatActivity {

    FrameLayout loadingframelayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        initializeAllComponents();

    }


    void initializeAllComponents() {
        loadingframelayout = findViewById(R.id.lyt_login_fragment_wrapper);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fraggy = new LoginFragment();
        fragmentTransaction.add(R.id.lyt_login_fragment_wrapper, fraggy);
        fragmentTransaction.commit();
    }
}
