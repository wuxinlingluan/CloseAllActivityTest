package com.github.closeallactivitytest;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private MyApp app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app =   (MyApp) getApplication();
        app.add(this);
    }
    public void click(View view) {
        startActivity(new Intent(MainActivity.this,SecondActivity.class));
    }

    @Override
    public void onBackPressed() {
        app.exit();
  //      super.onBackPressed();
    }
}
