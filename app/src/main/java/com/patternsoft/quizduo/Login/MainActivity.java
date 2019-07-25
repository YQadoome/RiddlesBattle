package com.patternsoft.quizduo.Login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.patternsoft.quizduo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements IMainContract.MainActivityView {


    @BindView(R.id.login) TextView signIn;
    @BindView(R.id.signUp) TextView signUp;
    @BindView(R.id.loginView) RelativeLayout loginRV;
    @BindView(R.id.signUpView) RelativeLayout registrationRV;
    @BindView(R.id.usernameEntry) EditText usernameLogin;
    @BindView(R.id.passwordEntry) EditText passwordLogin;
    @BindView(R.id.usernameRegEntry) EditText usernameReg;
    @BindView(R.id.passwordRegEntry) EditText passwordReg;
    @BindView(R.id.emailRegEntry) EditText emailReg;

    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter=new MainActivityPresenter(this);


    }
    public void onClick(View view){
            //must inject EditText before then set data into the variables
        switch (view.getId()){
            case R.id.login:
                presenter.attemptLogin(usernameLogin.getText().toString(),passwordLogin.getText().toString());
                break;
            case R.id.signUp:
                presenter.addUser(usernameReg.getText().toString(),passwordReg.getText().toString(),emailReg.getText().toString());
                break;
        }

        //send the data to presenter class to pass it to the model class to validate;

    }

    private void initViews(){

      //  signin=findViewById(R.id.login);


    }

//need to factor to mvp
    public void clicked(View view) {
        int id=view.getId();
        switch (id)
        {
            case R.id.login:
                displayRV(loginRV,registrationRV,signIn,signUp);
                break;
            case R.id.signUp:
                displayRV(registrationRV,loginRV,signUp,signIn);
                break;

        }
    }



    //need to factor to mvp
    private void displayRV(RelativeLayout show, RelativeLayout hide, TextView colored, TextView nonColored) {

        show.setVisibility(View.VISIBLE);
        show.animate().translationY(0).setDuration(1500);

        hide.setVisibility(View.GONE);
        hide.animate().translationY(hide.getHeight());

        colored.setTextColor(getResources().getColor(R.color.mainColorText));
        colored.animate().alpha(1.0f).setDuration(1500);

        nonColored.setTextColor(getResources().getColor(R.color.grayText));

    }

    @Override
    public void loginFailed() {

    }

    @Override
    public void registeringFailed() {

    }

    @Override
    public void navigateToMainScreen() {

    }

}
