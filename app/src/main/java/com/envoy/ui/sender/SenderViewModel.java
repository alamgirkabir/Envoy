package com.envoy.ui.sender;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SenderViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private MutableLiveData<String> mText;

    public SenderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Sender fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}