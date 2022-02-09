package com.envoy.ui.template;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class TemplateViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private MutableLiveData<String> mText;

    public TemplateViewModel() {
        mText = new MutableLiveData<>();

        mText.setValue("Templates");

        mText.setValue("");

    }

    public LiveData<String> getText() {
        return mText;
    }
}