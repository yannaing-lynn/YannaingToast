package com.orange.librarytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yannainglynn.toast.YannaingToast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        YannaingToast yannaingToast = new YannaingToast(this);
        yannaingToast.simpleToast(getLayoutInflater(),"How are you?");
    }

}
