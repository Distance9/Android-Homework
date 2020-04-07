package com.chen.my.application.chapter5_lifedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> mutableLiveData;

    public MyViewModel() {
        this.mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(0);
    }

    public MutableLiveData<Integer> getMutableLiveData() {
        return mutableLiveData;
    }

    public void add(int i){
        mutableLiveData.setValue(mutableLiveData.getValue()+i);
    }
}
