package com.chen.my.application.chapter6_databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyModel extends ViewModel {
    private MutableLiveData<Integer> mutableLiveData;

    public MyModel(){
        mutableLiveData=new MutableLiveData<>();
        mutableLiveData.setValue(0);
    }

    public MutableLiveData<Integer> getMutableLiveData() {
        return mutableLiveData;
    }

    public void add(){
        mutableLiveData.setValue(mutableLiveData.getValue()+1);
    }
}
