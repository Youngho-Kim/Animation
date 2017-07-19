package com.example.kwave.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

public class WindmillActivity extends AppCompatActivity implements View.OnClickListener {


    private Button start;
    private RelativeLayout windmill;
    private Button buttonRed;
    private Button buttonGreen;
    private Button buttonBlue;
    private Button buttonYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windmill);
        initView();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start:
                Animation translateupleft = AnimationUtils.loadAnimation(this, R.anim.translateupleft);
                Animation translateupright = AnimationUtils.loadAnimation(this, R.anim.translateupright);
                Animation translatedownleft = AnimationUtils.loadAnimation(this, R.anim.translatedownleft);
                Animation translatedownright = AnimationUtils.loadAnimation(this, R.anim.translatedownright);

                Animation rotatelayout = AnimationUtils.loadAnimation(this, R.anim.rotatelayout);

                buttonRed.startAnimation(translateupleft);
                buttonGreen.startAnimation(translateupright);
                buttonBlue.startAnimation(translatedownleft);
                buttonYellow.startAnimation(translatedownright);

                windmill.startAnimation(rotatelayout);
                break;
            case R.id.windmill :
                Intent intent = new Intent(this,PropertyActivity.class);
                startActivity(intent);
        }
    }

    private void initView() {
        start = (Button) findViewById(R.id.start);
        windmill = (RelativeLayout) findViewById(R.id.windmill);
        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        buttonYellow = (Button) findViewById(R.id.buttonYellow);
        start.setOnClickListener(this);
        windmill.setOnClickListener(this);
    }
}
