package com.chen.my.application.chapter4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MyViewModel myViewModel;
    Button button1;
    Button button2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewModel =new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).get(MyViewModel.class);

        button1=findViewById(R.id.button1);
        button2= findViewById(R.id.button2);
        textView=findViewById(R.id.textView);
        textView.setText(String.valueOf(myViewModel.count));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.count++;
                textView.setText(String.valueOf(myViewModel.count));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.count+=2;
                textView.setText(String.valueOf(myViewModel.count));
            }
        });
    }
}
