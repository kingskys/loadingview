package com.base.loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.base.loadingview.LoadingView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LoadingView loadingView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        loadingView = findViewById(R.id.loadingview);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                loadingView.showLoading();
                loadingView.setText("加载中。。。");
                break;
            case R.id.btn2:
                loadingView.showSuccess();
                loadingView.setText("成功");
                break;
            case R.id.btn3:
                loadingView.showFail();
                loadingView.setText("失败");
                break;
            default:
                break;
        }
    }
}
