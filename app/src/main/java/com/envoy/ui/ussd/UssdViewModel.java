package com.envoy.ui.ussd;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.envoy.ui.template.TemplateViewModel;

public class UssdViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private MutableLiveData<String> mText;

    public UssdViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Ussd fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}