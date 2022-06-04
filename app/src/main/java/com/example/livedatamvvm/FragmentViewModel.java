package com.example.livedatamvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public MutableLiveData<String> getString() {
        return mText;
    }

    public void setString(String text) {
        this.mText.setValue(text);
    }
}
