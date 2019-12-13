package com.example.geoquizmmvm.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.geoquizmmvm.R;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    public static final String TAG = "SingleFragmentActivity";

    public abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.activity_single_fragment);
        if (fragment == null)
            fragmentManager
                    .beginTransaction()
                    .add(R.id.activity_single_fragment, createFragment())
                    .commit();
    }
}
