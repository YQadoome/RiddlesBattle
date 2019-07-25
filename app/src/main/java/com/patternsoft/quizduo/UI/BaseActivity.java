package com.patternsoft.quizduo.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.patternsoft.quizduo.Login.IMainContract;
import com.patternsoft.quizduo.Login.MainActivityPresenter;
import com.patternsoft.quizduo.R;

public class BaseActivity extends AppCompatActivity  {
    MainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_acitivity);

    }




}
