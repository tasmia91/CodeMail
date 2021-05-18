package com.assignment.codemail.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");


        // 1. Tasmia -> Android
        // 2. Roheel -> React (Website)
        // 3. Maroof -> IOS
        // fetch username and password
        // connect to db
        // check in db
        /// close conneciton
        // update user about it.






        // 1. Tasmia -> Android, React and IOS (All should use the same backend)
        // fetch username and password
        // Integrate a RESTFul API of backend system whether user exists or not (Header-security token)
        // Take the action based on response from backend system
    }

    public LiveData<String> getText() {
        return mText;
    }
}