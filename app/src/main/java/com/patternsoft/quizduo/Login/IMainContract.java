package com.patternsoft.quizduo.Login;

public interface IMainContract {

    interface MainActivityView{

        void loginFailed();
        void registeringFailed();
        void navigateToMainScreen();

    }

    interface MainActivityPresenter{

        void attemptLogin(String username, String password);
        void addUser(String username,String password, String email);
    }



    interface MainActivityModel{

        boolean insertData(String username, String password, String email);
        boolean validateData(String username, String password);

    }
}
