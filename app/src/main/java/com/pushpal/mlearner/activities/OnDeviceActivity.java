package com.pushpal.mlearner.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pushpal.mlearner.R;

public class OnDeviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_device);

    }

    public void textDetection(View v) {
        Intent livePreviewIntent = new Intent(OnDeviceActivity.this, LivePreviewActivity.class);
        livePreviewIntent.putExtra("selectedModel", LivePreviewActivity.TEXT_DETECTION);
        startActivity(livePreviewIntent);
    }

    public void faceDetection(View view) {
        Intent livePreviewIntent = new Intent(OnDeviceActivity.this, LivePreviewActivity.class);
        livePreviewIntent.putExtra("selectedModel", LivePreviewActivity.FACE_DETECTION);
        startActivity(livePreviewIntent);
    }

    public void imageLabelDetection(View view) {
        Intent livePreviewIntent = new Intent(OnDeviceActivity.this, LivePreviewActivity.class);
        livePreviewIntent.putExtra("selectedModel", LivePreviewActivity.IMAGE_LABEL_DETECTION);
        startActivity(livePreviewIntent);
    }

    public void classification(View view) {
        Intent livePreviewIntent = new Intent(OnDeviceActivity.this, LivePreviewActivity.class);
        livePreviewIntent.putExtra("selectedModel", LivePreviewActivity.CLASSIFICATION);
        startActivity(livePreviewIntent);
    }

    public void barCodeDetection(View view) {
        Intent livePreviewIntent = new Intent(OnDeviceActivity.this, LivePreviewActivity.class);
        livePreviewIntent.putExtra("selectedModel", LivePreviewActivity.BARCODE_DETECTION);
        startActivity(livePreviewIntent);
    }
}
