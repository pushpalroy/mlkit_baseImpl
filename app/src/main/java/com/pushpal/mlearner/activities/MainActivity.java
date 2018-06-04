package com.pushpal.mlearner.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pushpal.mlearner.R;
import com.pushpal.mlearner.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mBinding.buttonOnDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onDeviceIntent = new Intent(MainActivity.this, OnDeviceActivity.class);
                startActivity(onDeviceIntent);
            }
        });
    }
}
