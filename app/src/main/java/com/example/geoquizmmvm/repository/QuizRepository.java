package com.example.geoquizmmvm.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.geoquizmmvm.R;
import com.example.geoquizmmvm.model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuizRepository {


    private static QuizRepository instance=new QuizRepository() ;
private List<Question> QuestionBank=new ArrayList<>();
private MutableLiveData<Integer> index ;

    private QuizRepository() {
    QuestionBank.add(new Question(R.string.question_australia, false));
        QuestionBank.add(new Question(R.string.question_oceans, true));
        QuestionBank.add(new Question(R.string.question_mideast, false));
        QuestionBank.add(new Question(R.string.question_africa, true));
        QuestionBank.add(new Question(R.string.question_americas, false));
        QuestionBank.add(new Question(R.string.question_asia, false));


    }

    public static QuizRepository getInstance() {
        return instance;
    }

    public List getQuestionBank() {
    return QuestionBank;
    }
}
