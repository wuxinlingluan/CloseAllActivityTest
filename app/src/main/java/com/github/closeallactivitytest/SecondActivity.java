package com.github.closeallactivitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    private MyApp app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        app = (MyApp) getApplication();
        app.add(this);
    }
    public void click(View view) {
        startActivity(new Intent(SecondActivity.this,MainActivity.class));
    }

    @Override
    public void onBackPressed() {
        app.exit();
        app.remove(this);
        //      super.onBackPressed();
    }
}
