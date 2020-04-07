package com.chen.my.application.chapter7_last;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreModel extends ViewModel {
    private MutableLiveData<Integer> aScore;
    private MutableLiveData<Integer> bScore;

    public ScoreModel(){
        aScore=new MutableLiveData<>();
        bScore=new MutableLiveData<>();
        aScore.setValue(0);
        bScore.setValue(0);
    }

    public MutableLiveData<Integer> getaScore() {
        return aScore;
    }

    public MutableLiveData<Integer> getbScore() {
        return bScore;
    }

    public void setaScore(int i){
        aScore.setValue(aScore.getValue()+i);
    }


    public void setbScore(int i){
        bScore.setValue(bScore.getValue()+i);
    }

    public void reset(){
        aScore.setValue(0);
        bScore.setValue(0);
    }
}
