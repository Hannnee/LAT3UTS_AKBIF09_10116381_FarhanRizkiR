package com.hana.myself;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RelativeLayout anim1;
    Animation uptodown;

    private ProgressBar mProgressBar;
    private TextView mLoadingView;
    private int mProgressStatus = 0;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anim1 = (RelativeLayout) findViewById(R.id.anim1);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        anim1.setAnimation(uptodown);

        mProgressBar = (ProgressBar) findViewById(R.id.progressbar);
        mLoadingView = (TextView) findViewById(R.id.loadingcmplt);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mProgressStatus < 100){
                    mProgressStatus++;
                    SystemClock.sleep(60);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mProgressBar.setProgress(mProgressStatus);
                        }
                    });
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mLoadingView.setVisibility(View.VISIBLE);
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent);
                    }
                });
            }
        }).start();
    }
    public void mulai(View view){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);

    }
}

