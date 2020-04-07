package com.chen.my.application.chapter6_databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chen.my.application.chapter6_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MyModel myModel;
    /*TextView textView;
    Button button;*/
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        /*textView=findViewById(R.id.textView);
        button=findViewById(R.id.button2);*/
        myModel=new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).get(MyModel.class);
        binding.setData(myModel);//
        binding.setLifecycleOwner(this);//监听


        /*myModel.getMutableLiveData().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.textView.setText(String.valueOf(integer));
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myModel.add();
            }
        });*/
    }
}
