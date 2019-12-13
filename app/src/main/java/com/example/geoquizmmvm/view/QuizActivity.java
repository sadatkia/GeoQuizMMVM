package com.example.geoquizmmvm.view;

import androidx.fragment.app.Fragment;

public class QuizActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return QuizFragment.newInstance();
    }


}
