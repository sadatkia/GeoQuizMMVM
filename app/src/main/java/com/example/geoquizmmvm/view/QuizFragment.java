package com.example.geoquizmmvm.view;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.geoquizmmvm.R;
import com.example.geoquizmmvm.databinding.FragmentQuizBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuizFragment extends Fragment {
private FragmentQuizBinding mBinding;

    public QuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_quiz,container,false);

        return mBinding.getRoot();
    }

    public static QuizFragment newInstance() {

        Bundle args = new Bundle();

        QuizFragment fragment = new QuizFragment();
        fragment.setArguments(args);
        return fragment;
    }



}
