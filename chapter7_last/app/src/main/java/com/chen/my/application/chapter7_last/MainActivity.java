package com.chen.my.application.chapter7_last;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.chen.my.application.chapter7_last.databinding.ActivityMainBinding;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ScoreModel scoreModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreModel=new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).get(ScoreModel.class);

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.setData(scoreModel);
        binding.setLifecycleOwner(this);
    }
}
