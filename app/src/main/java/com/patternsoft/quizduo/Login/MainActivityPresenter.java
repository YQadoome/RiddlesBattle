package com.patternsoft.quizduo.Login;

public class MainActivityPresenter implements IMainContract.MainActivityPresenter {

    //Here to send data to model interact

    private IMainContract.MainActivityModel model;
    private IMainContract.MainActivityView mView;
    MainActivityPresenter(IMainContract.MainActivityView view){
        this.mView = view;
    }
    @Override
    public void attemptLogin(String username, String password) {
        boolean success;
         success=model.validateData(username,password);
         if(!success)
             mView.loginFailed();
         else
             mView.navigateToMainScreen();
    }

    @Override
    public void addUser(String username, String password, String email) {
        boolean success;

       success=model.insertData(username,password,email);
        if(!success)
            mView.registeringFailed();
        else
            mView.navigateToMainScreen();
    }


}
