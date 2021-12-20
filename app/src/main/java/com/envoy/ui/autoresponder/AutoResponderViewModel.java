package com.envoy.ui.autoresponder;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AutoResponderViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public AutoResponderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Auto Responser fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}