package com.example.geoquizmmvm.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.geoquizmmvm.model.Question;
import com.example.geoquizmmvm.repository.QuizRepository;

public class QuizViewModel extends AndroidViewModel {
    public void  UserPress(){

    }

//private MutableLiveData<Intiger>

    public QuizViewModel(@NonNull Application application) {
        super(application);

        QuizRepository.getInstance();


    }

    public void NextQuestion(){

    }

    public  void prevQuestion(){

    }


}
