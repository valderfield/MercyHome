package com.example.app_utils.utils.splash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.app_utils.R;

/**
 * @author mercy
 * @Date 2022/9/20
 * @Edit
 * @describe 判断是否第一次 启动引导页面 三秒后进入想要的界面
 * @From or To
 * @Mark
 */
@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY = 3000; // 延迟3秒
    boolean isFirst = false;
    private static final int GO_HOME = 1000;
    private static final int GO_GUIDE = 1001;
    private static final String SP_IS_FIRST = "is_first";


    @SuppressLint("HandlerLeak")
    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case GO_HOME:
                    goHome();
                    break;
                case GO_GUIDE:
                    goGuide();
                    break;
            }
            super.handleMessage(msg);
        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();

    }
    private void initView() {
        //通过 sp读取判断是否第一次  后续新增判断是否第一次
        SharedPreferences preferences = getSharedPreferences(
                "isFirst", MODE_PRIVATE);
        boolean isFirst = preferences.getBoolean(SP_IS_FIRST, true);
        if (isFirst){
            SharedPreferences.Editor edit = preferences.edit();
            edit.putBoolean("isFirst",false);
            edit.apply();
            mHandler.sendEmptyMessageDelayed(GO_GUIDE, SPLASH_DISPLAY);
        }else {
            mHandler.sendEmptyMessageDelayed(GO_HOME, SPLASH_DISPLAY);
        }
    }

    private void goGuide() {
        Intent intent = new Intent(this, GuideActivity.class);
        startActivity(intent);
        finish();
    }
    private void goHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
